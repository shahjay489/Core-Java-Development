
package com.jayshah.chapter_16_Java8_Features._3.demo;

import java.util.function.Supplier;

public class Test7 {
    public static void main(String[] args) {
        System.out.println(Math.random());  //it will provide any random value between 0 to 1
        System.out.println((int) (Math.random() * 100));

        Supplier<Integer> sv = () -> (int) (Math.random() * 100);
        System.out.println(sv.get());

        Supplier<String> s = () ->
        {
            String[] names = {"Govardhan", "Dwarkesh", "Giriraj", "Mahaprabhuji", "Yamunaji"};
            int i = (int) (Math.random() * 4);
            return names[i];
        };
        System.out.println(s.get());
    }
}
