/*

Pattern - 3
*****
****
***
**
*

* */
package com.jayshah.chapter_3_Control_Statements._6_Star_Pattern_Programs;

public class _5_StarPattern3 {
    public static void main(String[] args)
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=5; j>=i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
