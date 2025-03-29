package com.jayshah.chapter_8_Strings._3_String_Buffer_Builder_Tokenizer.StringPrograms;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Print all duplicate characters
        printDuplicateCharacters(inputString);
        
        scanner.close();
    }

    // Method to print all duplicate characters in the string
    public static void printDuplicateCharacters(String str) {
        // Create a HashMap to store the frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        
        // Loop through the string and count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Update the frequency map
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        
        // Print the characters which have frequency more than 1 (duplicates)
        System.out.println("Duplicate characters in the string:");
        boolean found = false; // Flag to track if any duplicate is found
        
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times.");
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No duplicate characters found.");
        }
    }
}
