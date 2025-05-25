package com.jayshah.chapter_15_Collection_Framework_Generics._3.programs.CloneableDemo;

public class Test implements Cloneable {
    int i;
    String str;

    Test() {
    }

    Test(int i, String str) {
        this.i = i;
        this.str = str;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Test t1 = new Test(10, "Govardhan");

        Test t2 = (Test) t1.clone();

        System.out.println(t2.i);
        System.out.println(t2.str);
    }
}
