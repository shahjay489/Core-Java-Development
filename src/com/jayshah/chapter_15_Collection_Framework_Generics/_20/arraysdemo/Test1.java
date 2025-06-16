package com.jayshah.chapter_15_Collection_Framework_Generics._20.arraysdemo;

import java.util.HashMap;

public class Test1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("Govardhan", 101);
    }
}

/*
    We can provide any number of parameters in generics.
    For example, Map<K, V>
 */