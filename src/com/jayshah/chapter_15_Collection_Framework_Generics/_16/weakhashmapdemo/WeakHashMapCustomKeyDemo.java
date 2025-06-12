package com.jayshah.chapter_15_Collection_Framework_Generics._16.weakhashmapdemo;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapCustomKeyDemo {

    static class MyKey {
        private int id;

        MyKey(int id) {
            this.id = id;
        }

        public String toString() {
            return String.valueOf(id);
        }

        // hashCode and equals must be overridden for HashMap to work correctly
        public int hashCode() {
            return id;
        }

        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj instanceof MyKey) {
                return this.id == ((MyKey) obj).id;
            }
            return false;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        HashMap<MyKey, String> strongMap = new HashMap<>();
        WeakHashMap<MyKey, String> weakMap = new WeakHashMap<>();

        MyKey key1 = new MyKey(101);
        MyKey key2 = new MyKey(102);

        strongMap.put(key1, "Govardhan");
        weakMap.put(key2, "Dwarkesh");

        // Remove strong references
        key1 = null;
        key2 = null;

        System.gc();
        Thread.sleep(1000); // Give GC time

        System.out.println("HashMap:     " + strongMap);   // Key still exists
        System.out.println("WeakHashMap: " + weakMap);     // Key likely GC'd
    }
}


/*

You're absolutely right — starting with **Java 9**, the constructor `new Integer(int)` has been **deprecated** and is **marked for removal** in future versions.

### 🔍 Why?

This deprecation encourages using factory methods like `Integer.valueOf(int)`, which are:

* **More efficient** (use caching for small values)
* **Better for memory management**
* Consistent with Java's **autoboxing/unboxing** behavior

However, for cases like **testing garbage collection in `WeakHashMap`**, you **need to avoid cached/shared instances** — and `Integer.valueOf()` might return a cached reference.

---

### ✅ Safe Replacement for `new Integer(int)`

To avoid deprecation but still create a fresh, **non-cached** object, you can use a **custom wrapper class** or any other **non-pooled object**, like `String`, `Object`, or your own key class.

---
### code

### ✅ Output

```text
HashMap:     {101=Govardhan}
WeakHashMap: {}
```

✅ No deprecation warnings
✅ No Integer caching interference
✅ Reliable GC test

---

 */