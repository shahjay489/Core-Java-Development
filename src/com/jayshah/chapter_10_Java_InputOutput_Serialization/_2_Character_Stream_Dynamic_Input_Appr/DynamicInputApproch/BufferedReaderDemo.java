package com.jayshah.chapter_10_Java_InputOutput_Serialization._2_Character_Stream_Dynamic_Input_Appr.DynamicInputApproch;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        try {
//            InputStreamReader isr=new InputStreamReader(System.in);
//            BufferedReader br=new BufferedReader(isr);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Name : ");
            //int i=br.read();
            String s = br.readLine();
            System.out.println(s);

            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/*
    br.read()   // here you can check -> read data in different form
    br.readLine()   // here you can check -> read data in int & String only
 */