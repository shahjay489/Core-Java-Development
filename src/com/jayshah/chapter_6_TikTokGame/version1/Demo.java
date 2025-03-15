package com.jayshah.chapter_6_TikTokGame.version1;

import javax.swing.JFrame;

public class Demo extends JFrame
{
    Demo()
    {
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new Demo();
    }
}