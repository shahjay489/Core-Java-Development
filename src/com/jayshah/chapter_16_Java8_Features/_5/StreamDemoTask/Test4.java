package com.jayshah.chapter_16_Java8_Features._5.StreamDemoTask;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * WAP to get the first character of each name <br>
 * WAP to replace the 'a' charcter with 'z' character
 */

public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Govardhan");
        al.add("Dwarkesh");
        al.add("Giriraj");
        al.add("Mahaprabhuji");
        al.add("Yamunaji");

        Stream<String> s = al.stream();
        s.map(e -> e.charAt(0)).forEach(e -> System.out.println(e));

        // ----------------------------------------

        String name = "Govardhan";
        System.out.println(name.replace("a", "z"));

        Stream<String> s1 = al.stream();
        s1.map(e -> e.replace("a", "z")).forEach(e -> System.out.println(e));
    }
}
