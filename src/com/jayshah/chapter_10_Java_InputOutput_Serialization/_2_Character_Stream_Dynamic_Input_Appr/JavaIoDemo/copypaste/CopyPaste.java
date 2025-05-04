package com.jayshah.chapter_10_Java_InputOutput_Serialization._2_Character_Stream_Dynamic_Input_Appr.JavaIoDemo.copypaste;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyPaste {
    public static void main(String[] args) {
        try {
            var fis = new FileInputStream("E:\\copypaste\\thankyou.png");
            FileOutputStream fos = new FileOutputStream("E:\\copypaste\\newimg.png");

            int i;
            while ((i = fis.read()) != -1) {
//                System.out.println(i);  // this will print ASCII value of each one
                //System.out.print((char)i);    // this will print properly
                fos.write(i);
            }

            fis.close();
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


/*

    -1 : there is no ASCII value like -1
       : That is why Java By default set -1 means there is nothing ahead to read.
       : Also, ASCII value start with 0 and 0 means empty.
 */