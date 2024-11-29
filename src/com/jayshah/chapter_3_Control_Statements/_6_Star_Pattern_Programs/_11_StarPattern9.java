/*
Pattern - 9 : combination of pattern-1 and pattern-3
   *
  ***
 *****
*******

* */
package com.jayshah.chapter_3_Control_Statements._6_Star_Pattern_Programs;

public class _11_StarPattern9 {
    public static void main(String[] args)
    {
        for(int i=1; i<=4; i++)
        {
            for(int j=3; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=(i*2)-1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
