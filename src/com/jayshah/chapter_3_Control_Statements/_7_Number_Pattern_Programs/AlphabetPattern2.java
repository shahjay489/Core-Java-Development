package com.jayshah.chapter_3_Control_Statements._7_Number_Pattern_Programs;

class AlphabetPattern2
{
    public static void main(String[] args)
    {
        int count=64; // ASCII value
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print((char)(count+i)+" ");
            }
            System.out.println();
        }
    }
}

/*
A
B B
C C C
D D D D
*/