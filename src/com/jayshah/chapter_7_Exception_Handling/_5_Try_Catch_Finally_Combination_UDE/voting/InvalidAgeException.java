package com.jayshah.chapter_7_Exception_Handling._5_Try_Catch_Finally_Combination_UDE.voting;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException() {
        super();
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}

/*

super():
    - it calls parent class constructor

*/