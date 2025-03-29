package com.jayshah.chapter_8_Strings._3_String_Buffer_Builder_Tokenizer.StringPrograms;

import java.util.Scanner;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Remove duplicates from the string
        String result = removeDuplicates(inputString);
        
        // Print the result
        System.out.println("String after removing duplicates: " + result);
        
        scanner.close();
    }

    // Method to remove duplicates from the string
    public static String removeDuplicates(String str) {
        // Use a LinkedHashSet to preserve the order of characters while removing duplicates
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        
        // Convert the string to a character array and add each character to the LinkedHashSet
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        
        // Build the result string from the set
        StringBuilder result = new StringBuilder();
        for (Character ch : set) {
            result.append(ch);
        }
        
        return result.toString();
    }
}
