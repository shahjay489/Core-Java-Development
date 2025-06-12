package com.jayshah.chapter_15_Collection_Framework_Generics._16.weakhashmapdemo;

import java.util.HashMap;
import java.util.WeakHashMap;

public class Test2 {
    public static void main(String[] args) {
        // 'Integer(int)' is deprecated since version 9 and marked for removal
//         Integer i1 = new Integer(101);
//         Integer i2 = new Integer(102);

        /*
            there are 2 ways to solve above errors..

            1.) autoboxing
                Integer i1 = 101;
                Integer i2 = 102;

            2.) explicitly
                Integer i1 = Integer.valueOf(101);
                Integer i2 = Integer.valueOf(102);
         */

        Integer i1 = Integer.valueOf(101);
        Integer i2 = Integer.valueOf(102);

//        HashMap hm = new HashMap();
        WeakHashMap hm = new WeakHashMap();

        hm.put(i1, "Govardhan");
        hm.put(i2, "Dwarkesh");

        i2 = null;
        System.gc();

        System.out.println(hm);
    }
}


/*

Great question! You're observing a difference in behavior between `HashMap` and `WeakHashMap` based on how the keys (`i1`, `i2`) are created — specifically the difference between:

### Case 1: Using `Integer.valueOf(...)`

```java
Integer i1 = Integer.valueOf(101);
Integer i2 = Integer.valueOf(102);
```

### Case 2: Using `new Integer(...)`

```java
Integer i1 = new Integer(101);
Integer i2 = new Integer(102);
```

---

## 🔍 Root Cause: Java Integer Caching (Integer Pooling)

Java caches `Integer` values between **-128 to 127** when using `Integer.valueOf(...)`. This is called **Integer caching** or **boxing cache**.

So:

```java
Integer i2 = Integer.valueOf(102); // returns a cached reference if in -128 to 127
```

In your case, `102` is **outside** the caching range, so this will **still** return a **new Integer object** (same as `new Integer(102)` in behavior). So that doesn't explain your issue directly.

But **here’s the trick**: `Integer.valueOf(...)` **may return shared references** depending on the JVM’s implementation and internal caching. If it's cached, **some internal reference may prevent garbage collection**, especially in debug or console environments or under low memory pressure.

---

## 🧠 Difference in Behavior

Let’s break down what’s happening.

### 📌 HashMap

* Holds **strong references** to keys.
* Even if `i2 = null`, the map itself keeps the key alive.
* So the entry stays.

### 📌 WeakHashMap

* Holds **weak references** to keys.
* If **no strong references** exist to a key, it is eligible for GC.
* So once `i2 = null`, and no other reference to that key exists, it can be GC’d.

### Why are the results inconsistent?

* In the first case, you use `Integer.valueOf(102)`. This *might* return a cached or shared object (depending on the value or JVM optimizations).
* Even if `i2 = null`, **some other part of the JVM (or the cache itself)** may still hold a strong reference to the `Integer(102)` object. Thus, GC doesn’t remove it, and the `WeakHashMap` still has it.
* In the second case, `new Integer(102)` ensures it's a **new, unique object** with **no other reference**. So when you nullify `i2`, and call `System.gc()`, **GC removes the entry** from the `WeakHashMap`.

---

## ✅ Final Summary

| Method                 | Reference Behavior           | GC in WeakHashMap      |
| ---------------------- | ---------------------------- | ---------------------- |
| `Integer.valueOf(102)` | May return cached/shared ref | Not GC'd (entry stays) |
| `new Integer(102)`     | Always new, unique object    | GC'd (entry removed)   |

---

## 🧪 Best Practice for Testing `WeakHashMap` Behavior

To reliably test GC behavior:

* Avoid using boxed primitives like `Integer.valueOf(...)`.
* Use `new` to ensure fresh objects.
* Force memory pressure or allocate many objects to better trigger GC.
* Remember `System.gc()` is just a *suggestion* to the JVM.

----

* **`new Integer()`** (new object → GC eligible)
* **Boxed `Integer.valueOf()`** (may use cached/shared object → not GC’d)

---



**Why this happens:**

* `HashMap` holds a **strong reference**, so key and value remain.
* `WeakHashMap` only keeps a **weak reference** to the key. Once it's `null` and GC runs, the entry is eligible for removal.

---

### 🛑 If you use `Integer.valueOf(...)`:

Try replacing:

```java
Integer key2 = new Integer(102);
```

with:

```java
Integer key2 = Integer.valueOf(102); // Possibly cached
```

Now the output will likely be:

```text
WeakHashMap:  {102=Dwarkesh}
```

Because the key might still be strongly reachable via the Integer cache, so it's **not collected**.

---

### 📌 Conclusion:

To test `WeakHashMap` properly:

* Always use `new` for custom objects or wrapper classes.
* Don't rely on boxed (possibly cached) primitives like `Integer.valueOf(...)`.


 */