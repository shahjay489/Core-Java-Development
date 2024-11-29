/*
Pattern - 8 : combination of pattern-1 and pattern-3
   *
  ***
 *****
*******

* */
package com.jayshah.chapter_3_Control_Statements._6_Star_Pattern_Programs;

public class _10_StarPattern8 {
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
                System.out.print("*");
            }
            for(int l=2; l<=i; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
