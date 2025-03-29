package com.jayshah.chapter_8_Strings._3_String_Buffer_Builder_Tokenizer.StringPrograms;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Reverse the string
        String reversedString = reverse(inputString);

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);

        // Close the scanner
        scanner.close();
    }

    // Method to reverse the string
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
