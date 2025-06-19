package com.jayshah.chapter_16_Java8_Features._2.demo;

interface I4 {
    //void m4(int a);
    //void m4(int a, int b);
    void m4(String name);
}

public class Test4 {
    public static void main(String[] args) {
        //I4 i=(int a) -> System.out.println(a*a);
        //i.m4(20);

        //I4 i= (int a, int b) -> System.out.println(a+b);
        //i.m4(10, 20);

//        I4 i=(a,b)->
//            {
//                int res=a+b;
//                System.out.println(res);
//            };
//        i.m4(100, 200);

        I4 i = (String name) -> System.out.println(name.length());
        i.m4("Govardhan");
    }
}
