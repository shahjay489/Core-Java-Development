package com.jayshah.chapter_15_Collection_Framework_Generics._18.hashTableDemo;

import java.util.Hashtable;

public class Test {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable(15);

        ht.put(101, "Govardhan");
        ht.put(105, "Mahaprabhuji");
        ht.put(104, "Yamunaji");
        ht.put(102, "Dwarkesh");
        ht.put(106, "Giririajji");
        ht.put(116, "Gopal");

        // ht.put(null, "Gopal");  // java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null

        // ht.put(116, null);  // java.lang.NullPointerException  - We can not put null as value

        System.out.println(ht);
    }
}
