package com.jayshah.chapter_15_Collection_Framework_Generics._10.sortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test6
{
    public static void main(String[] args)
    {
        // SortedSet is an interface
        // so we can not create the object of the interface
        // but its implemented class is TreeSet
        // we can create the object of the implemented class.
        SortedSet ss=new TreeSet();
        
//        ss.add(10);
//        ss.add(30);
//        ss.add(80);
//        ss.add(60);
//        ss.add(20);

        ss.add("Mahaprabhuji");
        ss.add("Govardhan");
        ss.add("Dwarkesh");
        ss.add("Yamunaji");
        ss.add("Girirajji");

        ss.add(new StringBuffer("ddd"));
        
        System.out.println(ss);
    }
}

/*
You're absolutely right to notice this discrepancy, and it's a great observation. Let's break this down clearly.

---

### ✅ What Your Professor Said

> *"StringBuffer does not implement Comparable, so inserting it into a TreeSet will cause a `ClassCastException`."*

That used to be true in older versions of Java, before Java 1.5.

---

Question:
professor says that stringbuffer is not implements comparable interface that is why when we try this then it will give an exception...
java.lang.ClassCastException

------------------------------------------------
when he shows the Stringbuffer class 
that time  this is showing
public final class StringBuffer
    extends AbstractStringBuilder
    implements Serializable,CharSequence
{....................}


but when I check , i can see this 

public final class StringBuffer
    extends AbstractStringBuilder
    implements Serializable, Comparable<StringBuffer>, CharSequence
{
..................
}

--------------------------------------------------




### 🧠 Your Observation

You checked the current `StringBuffer` class and found:

```java
public final class StringBuffer
    extends AbstractStringBuilder
    implements Serializable, Comparable<StringBuffer>, CharSequence
```

This means modern versions of Java (1.5 and later) do have `StringBuffer` implementing:

```java
Comparable<StringBuffer>
```

So technically, inserting a `StringBuffer` into a `TreeSet` should not throw a `ClassCastException` if all elements are of type `StringBuffer`.

---

### ⚠️ But Here's the Catch in Your Code:

You are adding both `String` and `StringBuffer` to the same `TreeSet`:

```java
ss.add("Mahaprabhuji");           // String
...
ss.add(new StringBuffer("ddd")); // StringBuffer
```

### ❌ This is the real reason you're getting:

```
java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.StringBuffer
```

Because a `TreeSet` (which is a `SortedSet`) requires all elements to be mutually comparable.

In other words, when `TreeSet` tries to compare a `StringBuffer` with a `String`, it doesn't know how — their `compareTo()` methods are for different types.

* `String implements Comparable<String>`
* `StringBuffer implements Comparable<StringBuffer>`

They are not mutually comparable.

---

### ✅ Fixes

#### Option 1: Use only `String` or only `StringBuffer`

```java
SortedSet<StringBuffer> ss = new TreeSet<>();
ss.add(new StringBuffer("Mahaprabhuji"));
ss.add(new StringBuffer("Govardhan"));
// etc.
```

This will work because all elements are of the same type and comparable with each other.

#### Option 2: Use a custom Comparator (e.g., convert to String before comparing)

```java
SortedSet<Object> ss = new TreeSet<>((o1, o2) -> o1.toString().compareTo(o2.toString()));

ss.add("Mahaprabhuji");
ss.add("Govardhan");
ss.add(new StringBuffer("ddd"));  // No ClassCastException
```

This works by defining a consistent way to compare mixed types using their string representations.

---

### ✅ Summary

| Point                                                                         | Explanation                                                   |
| ----------------------------------------------------------------------------- | ------------------------------------------------------------- |
| `StringBuffer` now implements `Comparable<StringBuffer>`                      | ✅ True in Java 1.5+                                           |
| TreeSet throws `ClassCastException` when comparing incompatible types         | ✅ Happens when comparing `String` vs `StringBuffer`           |
| Your professor may be using an older JDK or illustrating a conceptual pitfall | ✅ Could be a teaching point rather than a literal truth today |

 */
