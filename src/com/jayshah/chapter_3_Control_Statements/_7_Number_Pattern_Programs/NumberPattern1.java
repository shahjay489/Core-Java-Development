package com.jayshah.chapter_3_Control_Statements._7_Number_Pattern_Programs;

class NumberPattern1
{
    public static void main(String[] args)
    {
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*

1
1 2
1 2 3
1 2 3 4

* */