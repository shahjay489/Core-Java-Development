package com.jayshah.chapter_7_Exception_Handling._2_Checked_Unchecked_Exceptions_Throw.demo;

public class Test1
{
    public static void main(String[] args)
    {
        Test1 t1=new Test1();
        t1.m1();
    }
    void m1()
    {
        divide();
    }
    void divide()
    {
        int a=100, b=0, c;
        c=a/b;
        System.out.println(c);
    }
}