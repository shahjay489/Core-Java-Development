package com.jayshah.chapter_16_Java8_Features._5.StreamDemoTask;


import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * WAP to sort an arraylist contain integer values
 */
public class Test5 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(40);
        al.add(20);
        al.add(50);
        al.add(30);

        Stream<Integer> s = al.stream();
        s.sorted().forEach(e -> System.out.println(e)); // default ascending order

        Stream<Integer> s1 = al.stream();
        s1.sorted((x, y) -> -x.compareTo(y)).forEach(e -> System.out.println(e));    // descending order
    }
}
