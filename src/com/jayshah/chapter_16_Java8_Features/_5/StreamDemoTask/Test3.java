package com.jayshah.chapter_16_Java8_Features._5.StreamDemoTask;


import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * WAP to print all the names whose name starts with d
 */
public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Govardhan");
        al.add("Dwarkesh");
        al.add("Giriraj");
        al.add("Mahaprabhuji");
        al.add("Yamunaji");

        Stream<String> s = al.stream();
        s.filter(e -> e.startsWith("D")).forEach(e -> System.out.println(e));
    }
}
