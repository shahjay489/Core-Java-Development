package com.jayshah.chapter_16_Java8_Features._2.demo;

public class Test8 {
    public static void main(String[] args) {
        Runnable r = () ->
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("hi i am child thread");
            }
        };

        Thread t = new Thread(r);
        t.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("hi i am main thread");
        }
    }
}


//public class Test8 implements Runnable
//{
//    public void run()
//    {
//        for(int i=1; i<=5; i++)
//        {
//            System.out.println("hi i am child thread");
//        }
//    }
//    public static void main(String[] args)
//    {
//        Test8 ob=new Test8();
//        Thread t=new Thread(ob);
//        t.start();
//        
//        for(int i=1; i<=5; i++)
//        {
//            System.out.println("hi i am main thread");
//        }
//    }
//}
