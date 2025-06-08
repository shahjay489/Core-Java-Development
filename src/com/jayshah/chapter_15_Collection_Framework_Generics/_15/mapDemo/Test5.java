package com.jayshah.chapter_15_Collection_Framework_Generics._15.mapDemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test5 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();

        // hashmap does not have synchronized method
        // but if we want to get/convert in the synchronized form
        // then need to use Collections
        Map map = Collections.synchronizedMap(hm);

        HashMap hm2 = new HashMap(map);

        // this hm2 now works as synchronized way.
    }
}