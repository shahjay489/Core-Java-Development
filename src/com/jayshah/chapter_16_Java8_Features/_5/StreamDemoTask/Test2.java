package com.jayshah.chapter_16_Java8_Features._5.StreamDemoTask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * WAP to print all the string values whose length is greater than 5.
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Govardhan");
        al.add("Dwarkesh");
        al.add("Giriraj");
        al.add("Mahaprabhuji");
        al.add("Yamunaji");

        Stream<String> s = al.stream();
//        s.filter(e -> e.length() > 5).forEach(e -> System.out.println(e));
        List l = s.filter(e -> e.length() > 5).collect(Collectors.toList());
        System.out.println(l);
    }
}
