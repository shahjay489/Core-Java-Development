package com.jayshah.chapter_16_Java8_Features._5.StreamDemoTask;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * WAP to get Minimum and Maximum element in an ArrayList.
 */
public class Test6 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(40);
        al.add(20);
        al.add(50);
        al.add(30);

        Stream<Integer> s = al.stream();
        int min = s.min((x, y) -> x.compareTo(y)).get();
        System.out.println("Minimum Element is : " + min);

        Stream<Integer> s1 = al.stream();
        int max = s1.max((x, y) -> x.compareTo(y)).get();
        System.out.println("Maximum element is : " + max);
    }
}
