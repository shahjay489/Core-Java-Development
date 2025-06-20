package com.jayshah.chapter_16_Java8_Features._4.streamapidemo;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * How to get Stream instance?
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        // 1st way to get Stream instance
        Stream<Integer> s1 = al.stream();
        s1.forEach(e -> System.out.println(e));
        // forEach( Consumer );

        // 2nd way to get Stream instance : using static method (of() method)
        Stream s2 = Stream.of(al);
        s2.forEach(e -> System.out.println(e)); // at single time it will print all elements

        // 3rd way to get Stream instance : Collection
        //Stream s3 = Stream.of(100, 200, 300, 400, 500);
        Stream s3 = Stream.of("Govardhan", "Dwarkesh", "Giriraj", "Mahaprabhuji", "Yamunaji");
        s3.forEach(e -> System.out.println(e));

        // 4th way to get Stream instance : Array
        int[] arr = {600, 700, 800, 900, 1000};
        IntStream s4 = Arrays.stream(arr);
        s4.forEach(e -> System.out.println(e));

        // 5th way to get Stream empty instance
        Stream s5 = Stream.empty();

        // 6th way to get Stream instance : using builder
        Stream s6 = Stream.builder().build();
    }
}
