package com.jayshah.chapter_8_Strings._3_String_Buffer_Builder_Tokenizer;

import java.util.StringTokenizer;

public class StringTokenizerTest1 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("this is my first demo");
        System.out.println(st.countTokens());

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}

/*
Methods :-
  1. hasMoreTokens()- Return value: boolean
  2. nextToken() - Return value in String
  3. countTokens() - Return value in String
  4. hasMoreElements() - Return value: boolean
  5. nextElement()  - Return value in object
 */