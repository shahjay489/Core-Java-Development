package com.jayshah.chapter_8_Strings._3_String_Buffer_Builder_Tokenizer.StringPrograms;

import java.util.Scanner;

public class RemoveCharacterFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Prompt the user to enter the character to remove
        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0);
        
        // Remove the character from the string and print the result
        String result = removeCharacter(inputString, charToRemove);
        System.out.println("String after removing character: " + result);
        
        scanner.close();
    }

    // Method to remove the given character from the string
    public static String removeCharacter(String str, char charToRemove) {
        // Use the replaceAll method to remove all occurrences of the given character
        return str.replaceAll(String.valueOf(charToRemove), "");
    }
}
