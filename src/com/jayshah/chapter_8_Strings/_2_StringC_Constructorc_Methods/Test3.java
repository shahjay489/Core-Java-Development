package com.jayshah.chapter_8_Strings._2_StringC_Constructorc_Methods;

public class Test3 {
    public static void main(String[] args) {
        String str1 = "govardhan@gmail.com";
        String str2 = "govardhan123";

        System.out.println(str1.equals(str2));
        if (str1.equalsIgnoreCase("govardhan@gmail.com") && str2.equals("govardhan123")) {
            System.out.println("login successfully");
        } else {
            System.out.println("failed");
        }

        System.out.println("-----------compareTo/..IgnoreCase...............");
        // lexicographically compare
        String str3 = "a";
        String str4 = "A";
        System.out.println(str3.compareTo(str4));  // 97 - 65 = 32
        System.out.println(str3.compareToIgnoreCase(str4));  // 97 - 97 = 0
        /*
        - Compare method does lexicographically compare two strings

        If str3 = "ac" and str4 = "ab" then it compares 2nd value c and b because first character is same
        If str3 = "ac" and str4 = "Ab" then it compares 1st value a and A because first character are different, so it will not check 2nd value

         */


        char c = 'a';   //97
        //char c = 'A';     //65
        System.out.println((int) c);


        System.out.println("---------Concatenation of two strings-------------");
        String str5 = "Govardhan";
        String str6 = "java";
        System.out.println(str5 + str6);
        System.out.println(str5.concat(str6));

        //-----------------------------------------------------------------------

        System.out.println("-------------Get sub-string from String-----------------");
        String str7 = "Govardhan java";

        System.out.println(str7.substring(3, 8));   // output in string
        // here you can do more method chaining because it returns in the string
        // try str7.substring(3, 8). ... see what you can have

        System.out.println(str7.subSequence(3, 8)); // output in character sequence
        // here you can see methods of the Object class or CharSequence interface

        //----------------------------------------------------------------------

        System.out.println("-------------Replacing or Removing characters----------------");
        String str8 = "Govardhan java";
        System.out.println(str8.replace("a", "x"));
        // replaceAll - regex(regular expression) - will see in the project

        System.out.println(str8.replaceFirst("a", "z"));
        System.out.println(str8.replaceAll("a", "z"));

        //---------------------------------------------------------------------

        System.out.println("---------------------Searching characters in string-------------");
        String str9 = "Govardhan is teaching java";
        System.out.println(str9.indexOf("is"));
        System.out.println(str9.lastIndexOf("is")); // index position always left to right, just start for searching from the last
        System.out.println(str9.contains("an")); // return boolean
        System.out.println(str9.charAt(7));
        System.out.println(str9.startsWith("Gov")); // return boolean
        System.out.println(str9.endsWith("java")); // return boolean

        //----------------------------------------------------------------------
        System.out.println("-------------case conversion lowercase uppercase-----------");
        String str10 = "Govardhan Dwarkesh";
        System.out.println(str10.toLowerCase());

        //----------------------------------------------------------------------

        System.out.println("--------------type conversion---------------");
        int rollno = 1001;
        System.out.println(String.valueOf(rollno).length());
        // do one thing click on the String and search valueOf
        // it is static method : that's why we did String.valueOf(....)

        // toCharArray is not a static method
        String str11 = "Govardhan";
        char[] c2 = str11.toCharArray(); // return in character Array
        System.out.println(c2);


        //------------------------------------------------------------------------

        System.out.println("-------------------Split-----------------");
        // Lets in a simple way
        String str12 = "this is my first demo";
        String[] str = str12.split("is"); // split it and store in the array
        for (String s : str) {
            System.out.println(s);
        }


    }
}
