package com.jayshah.chapter_16_Java8_Features._4.streamapidemo;//WAP to convert all the names to uppercase

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * WAP to convert all the names to uppercase.
 */
public class Test4 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Govardhan");
        al.add("Dwarkesh");
        al.add("Giriraj");
        al.add("Mahaprabhuji");
        al.add("Yamunaji");

        Stream<String> s = al.stream();
        s.map(e -> e.toUpperCase()).forEach(e -> System.out.println(e));
    }
}
