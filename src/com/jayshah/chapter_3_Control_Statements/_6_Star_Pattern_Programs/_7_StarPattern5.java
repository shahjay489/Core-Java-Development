/*
Pattern - 5 : combination of pattern-3 and pattern-1
   *
  **
 ***
****

* */
package com.jayshah.chapter_3_Control_Statements._6_Star_Pattern_Programs;

public class _7_StarPattern5 {
    public static void main(String[] args)
    {
        for(int i=1; i<=4; i++)
        {
            for(int j=3; j>=i; j--)
            {
                System.out.print(" ");  // System.out.print("_");  without for- k loop
            }
            for(int k=1; k<=i; k++)   // check without for- j loop
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*

combination of these patterns

 *****              *
 ****               **
 ***                ***
 **                 ****
 *                  *****

* */