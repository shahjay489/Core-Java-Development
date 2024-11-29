/*
Pattern - 4 : combination of pattern-1 and pattern-3
 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *

* */
package com.jayshah.chapter_3_Control_Statements._6_Star_Pattern_Programs;

public class _6_StarPattern4 {
    public static void main(String[] args)
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<=4; i++)
        {
            for(int j=4; j>=i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
