package com.jayshah.chapter_8_Strings._3_String_Buffer_Builder_Tokenizer.StringPrograms;

import java.util.Scanner;
import java.util.HashSet;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Find and print the first repeating character
        char repeatingChar = firstRepeatingCharacter(inputString);
        
        // If a repeating character is found, print it, otherwise indicate no repeating character
        if (repeatingChar != '\0') {
            System.out.println("The first repeating character is: " + repeatingChar);
        } else {
            System.out.println("No repeating character found.");
        }
        
        scanner.close();
    }

    // Method to find the first repeating character
    public static char firstRepeatingCharacter(String str) {
        // Use a HashSet to keep track of characters we've seen
        HashSet<Character> seen = new HashSet<>();
        
        // Loop through the string and check for the first repeating character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // If the character is already in the set, it's a repeating character
            if (seen.contains(ch)) {
                return ch;
            }
            
            // Otherwise, add the character to the set
            seen.add(ch);
        }
        
        // If no repeating character is found, return the null character
        return '\0';
    }
}
