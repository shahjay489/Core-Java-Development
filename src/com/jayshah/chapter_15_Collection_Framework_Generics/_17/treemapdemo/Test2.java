package com.jayshah.chapter_15_Collection_Framework_Generics._17.treemapdemo;

import java.util.Comparator;
import java.util.TreeMap;

class NameComparison implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;

        return i1.compareTo(i2);    // default ascending order
        // return -i1.compareTo(i2);    // descending order


        //-----------------------
        /*
            for this need to one more extra class
            in that class object, we can pass int and string value
            then this will work
            - we already did same thing in comparable & comparator part
         */

        //String str1=(String)o1;
        //String str2=(String)o2;
        //return str1.compareTo(str2);
    }
}

public class Test2 {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap(new NameComparison());

        tm.put(106, "Girirrajji");
        tm.put(101, "Govardhan");
        tm.put(103, "ShriNathji");
        tm.put(102, "Dwarkesh");
        tm.put(105, "Yamunaji");
        tm.put(104, "Mahaprabhuji");

        System.out.println(tm);
    }
}
