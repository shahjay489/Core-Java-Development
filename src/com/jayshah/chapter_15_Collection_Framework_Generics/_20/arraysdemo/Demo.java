package com.jayshah.chapter_15_Collection_Framework_Generics._20.arraysdemo;

// This is Generics Class
// T : Parameterised_Type OR Type_Parameterization
// You can give any valid identifier like T, E, Jay.
class A<T> {
    T a;

    A(T a) {
        this.a = a;
    }

    void show() {
        System.out.println(a);
    }
}

public class Demo {
    public static void main(String[] args) {
        A<String> ob1 = new A<String>("Govardhan");
        ob1.show();

        A<Integer> ob2 = new A<Integer>(101);
        ob2.show();
    }
}
