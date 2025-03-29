package com.jayshah.chapter_8_Strings._3_String_Buffer_Builder_Tokenizer.StringPrograms;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class MaxOccurringCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Find the maximum occurring character
        char maxChar = getMaxOccurringChar(inputString);
        
        // Display the result
        System.out.println("The maximum occurring character is: " + maxChar);
        
        scanner.close();
    }

    // Method to find the maximum occurring character
    public static char getMaxOccurringChar(String str) {
        // Create a HashMap to store the frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        
        // Convert the string to a character array to iterate over it
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Skip spaces
            if (ch == ' ') continue;
            
            // Update the frequency map
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        
        // Find the character with the maximum frequency
        char maxChar = '\0'; // Initialize with null character
        int maxCount = 0;
        
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        
        return maxChar;
    }
}
