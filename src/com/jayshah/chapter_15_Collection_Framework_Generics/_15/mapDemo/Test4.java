package com.jayshah.chapter_15_Collection_Framework_Generics._15.mapDemo;

import java.util.HashMap;
import java.util.Map;

public class Test4 {
    public static void main(String[] args) {

        // we use generics here to get the values
        HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("101", "Govardhan");
        hm.put("102", "Dwarkesh");
        hm.put("103", "Giriraj");
        hm.put("104", "Mahaprabhuji");
        hm.put("105", "Yamunaji");

        for (Map.Entry me : hm.entrySet()) {
            System.out.println(me.getKey() + " : " + me.getValue());
        }
    }
}
