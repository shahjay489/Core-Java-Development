package com.jayshah.chapter_8_Strings._3_String_Buffer_Builder_Tokenizer.StringPrograms;

import java.util.Scanner;

/**
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all the original letters exactly once.<br>
 *
 * To check if two strings are anagrams of each other, we need to ensure that both strings: <br>
 *
 * 1.) Have the same length. <br>
 *
 * 2.) Contain the exact same characters in the same frequencies.
 */
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        
        // Check if the strings are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
        
        scanner.close();
    }

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // If lengths are different, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Convert both strings to lowercase to make the comparison case-insensitive
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        // Convert both strings to character arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        // Sort the character arrays
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        
        // Compare the sorted arrays
        return java.util.Arrays.equals(arr1, arr2);
    }
}
