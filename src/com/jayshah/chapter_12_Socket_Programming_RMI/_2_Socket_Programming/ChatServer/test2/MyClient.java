package com.jayshah.chapter_12_Socket_Programming_RMI._2_Socket_Programming.ChatServer.test2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.56.1", 2222);

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // for taking user input

            String str1 = "", str2 = "";
            while (!str1.equals("bye")) {
                str2 = br.readLine();
                dos.writeUTF(str2);
                dos.flush();

                str1 = dis.readUTF();
                System.err.println("Server Says : " + str1);    // just for changing the red color we use err otherwise we are using err only for error
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
