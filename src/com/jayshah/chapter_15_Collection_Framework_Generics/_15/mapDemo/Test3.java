package com.jayshah.chapter_15_Collection_Framework_Generics._15.mapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();

        hm.put("101", "Govardhan");
        hm.put("102", "Dwarkesh");
        hm.put("103", "Giriraj");
        hm.put("104", "Mahaprabhuji");
        hm.put("105", "Yamunaji");

        Set set = hm.entrySet();

        Iterator itr = set.iterator();

        HashMap hm2 = new HashMap();

        while (itr.hasNext()) {
            //System.out.println(itr.next());

            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry);


            if (entry.getKey().equals("103")) {
                System.out.println(entry.setValue("aaa"));
                hm2.put(entry.getKey(), entry.getValue());
            } else {
                hm2.put(entry.getKey(), entry.getValue());
            }
        }

        System.out.println("hm2: " + hm2);
    }
}

/*
    here, we use string as Key
    so we can use equals().
 */