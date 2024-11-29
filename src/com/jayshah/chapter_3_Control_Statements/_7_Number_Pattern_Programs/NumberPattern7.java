package com.jayshah.chapter_3_Control_Statements._7_Number_Pattern_Programs;

class NumberPattern7
{
    public static void main(String[] args)
    {
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if(j%2 == 0)
                {
                    System.out.print(0+" ");
                }
                else
                {
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }
    }
}

/*
1
1 0
1 0 1
1 0 1 0
*/
