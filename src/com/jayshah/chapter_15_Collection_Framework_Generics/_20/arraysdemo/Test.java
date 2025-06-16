package com.jayshah.chapter_15_Collection_Framework_Generics._20.arraysdemo;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        String[] strarr = new String[3];
        strarr[0] = "Govardhan";
        strarr[1] = "Dwarkesh";
        strarr[2] = "Giriraj";

        String name = strarr[1];
        System.out.println(name);

        //--------------------------------------------

        ArrayList al = new ArrayList(); // Collection - ArrayList is not a type safe

        al.add("Govardhan");
        al.add(101);
        al.add(10.0f);

        String name1 = (String) al.get(0);
        int aa = (int) al.get(1);       // need to typecast from Object to Integer
        System.out.println(name1);
        System.out.println(aa);

        //------------------------  Generics  ------------------

//        ArrayList<Integer> all = new ArrayList<Integer>();

//        ArrayList<String> all = new ArrayList<String>();
//        all.add("Govardhan");
//        all.add("Dwarkesh");
//        all.add("Giriraj");
//        String name2 = all.get(0);    // no need to typecast
    }
}
