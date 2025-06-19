package com.jayshah.chapter_16_Java8_Features._2.demo;

interface I6 {
    int getLength(String name);
}

public class Test6 {
    public static void main(String[] args) {
//        I6 i=(name)->
//            {
//                int leng = name.length();
//                return leng;
//            };
//        System.out.println(i.getLength("Govardhan"));

        //int l = i.getLength("Govardhan");
        //System.out.println("length is : "+l);


        I6 i = (name) -> name.length();
        System.out.println(i.getLength("Govardhan"));
    }
}
