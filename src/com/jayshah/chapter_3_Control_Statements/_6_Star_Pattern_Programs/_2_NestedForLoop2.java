package com.jayshah.chapter_3_Control_Statements._6_Star_Pattern_Programs;

class _2_NestedForLoop2
{
    public static void main(String[] args)
    {
        for(int i=1; i<=3; i++)
        {
            System.out.println("i : "+i);
            for(int j=1; j<=i; j++)
            {
                System.out.println("j : "+j);
            }
        }
    }
}
