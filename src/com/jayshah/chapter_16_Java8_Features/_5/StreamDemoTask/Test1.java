package com.jayshah.chapter_16_Java8_Features._5.StreamDemoTask;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * WAP to print all the numbers which are greater than 30
 * <br>
 * <br>
 * <p>
 * <p>
 * Prerequisite : Functional interfaces, Lambda Expression, Predefined Functional Interfaces, Stream API
 * </p>
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        al.stream().filter(e -> e > 30).forEach(e -> System.out.println(e));

        /*----------------------------------------------------
        Stream<Integer> s = al.stream();

        Predicate<Integer> p = (e) ->
        {
            return e > 30;
        };

        Consumer<Integer> c = (e) ->
        {
            System.out.println(e);
        };

        s.filter(p).forEach(c);
        ----------------------------------------*/

        //Stream<Integer> s1 = al.stream();
        //s1.filter(e -> e > 30).forEach(e -> System.out.println(e));


    }
}
