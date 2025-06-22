package com.jayshah.chapter_16_Java8_Features._5.StreamDemoTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * WAP to print the sum of all the even numbers in an ArrayList
 */
public class Test7 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(4);
        al.add(2);
        al.add(5);
        al.add(3);

        Stream<Integer> s = al.stream();
        List l = s.filter(e -> e % 2 == 0).collect(Collectors.toList());

        Stream<Integer> s1 = al.stream();
        Stream<Integer> s2 = s1.filter(e -> e % 2 == 0);         //get all even number streams
        IntStream is = s2.mapToInt(Integer::intValue);  //convert the Stream into IntStream
        System.out.println(is.sum());                   //sum all the numbers present in IntStream


        Stream<Integer> s3 = al.stream();
        int res = s3.filter(e -> e % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(res);


        /*
        // traditional way
        int sum = 0;
        Iterator<Integer> itr = l.iterator();
        while (itr.hasNext()) {
            sum = sum + itr.next();
        }
        System.out.println(sum);
         */
    }
}
