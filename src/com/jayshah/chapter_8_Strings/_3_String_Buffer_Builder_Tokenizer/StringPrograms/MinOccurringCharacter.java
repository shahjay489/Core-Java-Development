package com.jayshah.chapter_8_Strings._3_String_Buffer_Builder_Tokenizer.StringPrograms;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class MinOccurringCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Find the minimum occurring character
        char minChar = getMinOccurringChar(inputString);
        
        // Display the result
        System.out.println("The minimum occurring character is: " + minChar);
        
        scanner.close();
    }

    // Method to find the minimum occurring character
    public static char getMinOccurringChar(String str) {
        // Create a HashMap to store the frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        
        // Loop through the string and count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Skip spaces (optional based on requirement)
            if (ch == ' ') continue;
            
            // Update the frequency map
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        
        // Find the character with the minimum frequency
        char minChar = '\0'; // Initialize with null character
        int minCount = Integer.MAX_VALUE; // Start with a large number to find the minimum
        
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() < minCount) {
                minCount = entry.getValue();
                minChar = entry.getKey();
            }
        }
        
        return minChar;
    }
}
