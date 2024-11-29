package com.jayshah.chapter_3_Control_Statements._7_Number_Pattern_Programs;

class NumberPattern4
{
    public static void main(String[] args)
    {
        for(int i=1; i<=4; i++)
        {
            for(int j=i; j>=1; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*
1
2 1
3 2 1
4 3 2 1
*/
