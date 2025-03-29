package com.jayshah.chapter_8_Strings._3_String_Buffer_Builder_Tokenizer.StringPrograms;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Count the total number of words in the string
        int wordCount = countWords(inputString);
        
        // Display the result
        System.out.println("Total number of words: " + wordCount);
        
        scanner.close();
    }

    // Method to count the total number of words in a string
    public static int countWords(String str) {
        // Trim leading/trailing spaces and split the string based on whitespace
        String[] words = str.trim().split("\\s+");

        // Return the length of the array (number of words)
        return words.length;
    }

    // OR ----------------------------
    /*
    // Method to count the total number of words using StringBuilder
    public static int countWords(String str) {
        // Create a StringBuilder from the input string
        StringBuilder sb = new StringBuilder(str);

        // Convert StringBuilder to a string and trim leading/trailing spaces
        str = sb.toString().trim();

        // Split the string based on one or more spaces
        String[] words = str.split("\\s+");

        // Return the length of the array (number of words)
        return words.length;
    }
    */

}
