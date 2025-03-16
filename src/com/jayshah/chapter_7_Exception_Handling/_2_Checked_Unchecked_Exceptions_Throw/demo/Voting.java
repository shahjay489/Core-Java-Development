package com.jayshah.chapter_7_Exception_Handling._2_Checked_Unchecked_Exceptions_Throw.demo;

public class Voting
{
    public static void main(String[] args)
    {
        int age=10;
        
        Voting v=new Voting();
        v.checkAge(age);
    }
    void checkAge(int age)
    {
        if(age>=18)
        {
            youCanVote();
        }
        else
        {
            throw new RuntimeException("You cannot vote");
        }
    }
    void youCanVote()
    {
        System.out.println("you can vote successfully");
    }
}
