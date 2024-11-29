/*

Pattern - 1
*
**
***
****
*****

* */


package com.jayshah.chapter_3_Control_Statements._6_Star_Pattern_Programs;

public class _3_StarPattern1 {
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
    }
}
