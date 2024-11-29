package com.jayshah.chapter_3_Control_Statements._7_Number_Pattern_Programs;

class NumberPattern6
{
    public static void main(String[] args)
    {

        way1();
        way2();
    }

    private static void way1() {
        for(int i=1; i<=4; i++)
        {
            int k=4;
            for(int j=1; j<=i; j++)
            {
                System.out.print(k+" ");
                k=k-1;
            }
            System.out.println();
        }
    }

    public static void way2()
    {
        for(int i=4; i>=1; i--)
        {
            for(int j=4; j>=i; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*
4
4 3
4 3 2
4 3 2 1
*/