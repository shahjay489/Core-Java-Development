package com.jayshah.chapter_16_Java8_Features._4.streamapidemo;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test5 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Govardhan");
        al.add("Dwarkesh");
        al.add("Giriraj");
        al.add("Mahaprabhuji");
        al.add("Yamunaji");

        System.out.println(" *********** Without sorted  ***********");
        Stream<String> s = al.stream();
        s.forEach(e -> System.out.println(e));

        System.out.println(" *********** With Default(Ascending) Sorted  ***********");
        Stream<String> s1 = al.stream();
        s1.sorted().forEach(e -> System.out.println(e));

        System.out.println(" *********** With Descending Sorted  ***********");
        Stream<String> s2 = al.stream();
        s2.sorted((x, y) -> -x.compareTo(y)).forEach(e -> System.out.println(e));
    }
}
