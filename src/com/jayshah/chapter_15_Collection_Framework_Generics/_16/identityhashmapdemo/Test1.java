package com.jayshah.chapter_15_Collection_Framework_Generics._16.identityhashmapdemo;

public class Test1 {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 10;
        System.out.println(i1 == i2);                       //true

        // 'Integer(int)' is deprecated since version 9 and marked for removal
        // Integer i11 = new Integer(101);
        // Integer i22 = new Integer(102);

        /*
            there are 2 ways to solve above errors..

            1.) autoboxing
                Integer i11 = 101;
                Integer i22 = 102;

            2.) explicitly
                Integer i11 = Integer.valueOf(101);
                Integer i22 = Integer.valueOf(102);
         */

        System.out.println("101 == 102 then 101.equals(102)");
        Integer i11 = 101;
        Integer i22 = 102;
        System.out.println(i11 == i22);                       //false
        System.out.println(i11.equals(i22));                //true

        System.out.println("govardhan == govardhan then govardhan.equals(govardhan)");
        String str1 = "govardhan";
        String str2 = "govardhan";
        System.out.println(str1 == str2);                     //true
        System.out.println(str1.equals(str2));              //true

        System.out.println("using new : govardhan == govardhan then govardhan.equals(govardhan)");
        String str11 = new String("govardhan");
        String str22 = new String("govardhan");
        System.out.println(str11 == str22);                   //false
        System.out.println(str11.equals(str22));            //true

        Test1 t1 = new Test1();
        Test1 t2 = new Test1();
        System.out.println(t1 == t2);
        System.out.println(t1.equals(t2));
    }
}
// output written in comment here is before java9

/*
    --> Content Comparison
    --> Reference Comparison



    In case of Objects, .equals() and == operator are same.

    public boolean equals(Object obj) {
        return (this == obj);
    }
                  1001 = Address
                -----------
               |           | <----------t1
               | Object    |
               |           | <----------t2
               |___________|
----------------------------------------------------------------
    In case of String,

      public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        return (anObject instanceof String aString)
                && (!COMPACT_STRINGS || this.coder == aString.coder)
                && StringLatin1.equals(value, aString.value);
      }


                -----------
               |           | <---------- Str1
               | govardhan |
               |___________|

                -----------
               |           | <---------- Str2
               | govardhan |
               |___________|

 */

/*


| Method                        | Caching?                                   | `==` result for same value? | `.equals()` result? |
| ----------------------------- | ------------------------------------------ | --------------------------- | ------------------- |
| `new Integer(101)`            | ❌ Never cached                            | `false`                     | `true`              |
| `Integer.valueOf(101)`        | ✅ Cached (if in range)                    | `true`                      | `true`              |
| Autoboxing `Integer i = 101;` | ✅ Uses `Integer.valueOf()` under the hood | `true` or `false`           | `true`              |



What Is Caching?
Java tries to reuse objects to save memory and improve performance. This is called caching.

For the Integer class:

- When you call Integer.valueOf(int) with a value between -128 and 127, Java doesn’t create a new object.
- Instead, it returns a pre-created, cached object from memory.
- For values outside that range (e.g., 200), Java creates a new object every time.


Example of Cached Values (-128 to 127):
Integer i1 = Integer.valueOf(100);
Integer i2 = Integer.valueOf(100);
System.out.println(i1 == i2); // ✅ true → both refer to the *same* cached object
// Because 100 is inside the cached range, both i1 and i2 point to the same object in memory.

Example of Non-Cached Values (outside -128 to 127):
Integer i3 = Integer.valueOf(200);
Integer i4 = Integer.valueOf(200);
System.out.println(i3 == i4); // ❌ false → different objects in memory
// Since 200 is not cached, Java creates a new Integer object each time you call valueOf(200).

Why -128 to 127?
- This is defined in the Java specification (JVM spec) because:
- These values are very commonly used.
- It reduces memory usage and improves performance.
You can actually change the cache range by setting a JVM parameter.

 */