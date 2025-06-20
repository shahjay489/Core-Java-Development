package com.jayshah.chapter_16_Java8_Features._4.streamapidemo;//WAP to get all the even numbers in an arraylist

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * WAP to count all the even numbers in an ArrayList.
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(55);

        //-----------------using collections and simple logic--------------------
        for (int i : al) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //------------------using stream api (first part)-------------------------------
        Stream<Integer> s = al.stream();
        List l = s.filter(e -> e % 2 == 0).collect(Collectors.toList()); // this way is called method chaining
        System.out.println(l);
        // filter( Predicate )
        // Predicate<T> : take one argument


        //------------------using stream api (second part)-------------------------------
        Stream<Integer> s1 = al.stream();
        s1.filter(e -> e % 2 == 0).forEach(e -> System.out.println(e)); // here we do not collect just print it directly
        // here we completed code in 2 lines compare to first part (3 lines)

        //------------------using stream api (second part)-------------------------------
        al.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));
        // here we completed code in 1 line compare to second part (2 lines)


        //--------------count even numbers----------------------------
        System.out.println(al.stream().filter(e -> e % 2 == 0).count());


        // method chaining
        String name = "Govardhan";
        String sn1 = name.concat("java");
        String sn2 = sn1.toUpperCase();
        int ln = sn2.length();

        int leng = name.concat("java").toUpperCase().length();
        System.out.println(leng);
    }
}
