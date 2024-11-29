/*
Pattern - 7 : same as pattern-5 just make one space after *
   *
  * *
 * * *
* * * *

* */
package com.jayshah.chapter_3_Control_Statements._6_Star_Pattern_Programs;

public class _9_StarPattern7 {
    public static void main(String[] args)
    {
        for(int i=1; i<=4; i++)
        {
            for(int j=3; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
