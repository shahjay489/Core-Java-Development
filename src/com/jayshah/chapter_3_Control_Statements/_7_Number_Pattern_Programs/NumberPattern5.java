package com.jayshah.chapter_3_Control_Statements._7_Number_Pattern_Programs;

class NumberPattern5
{
    public static void main(String[] args)
    {
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            for(int k=i-1; k>=1; k--)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}

/*
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
*/
