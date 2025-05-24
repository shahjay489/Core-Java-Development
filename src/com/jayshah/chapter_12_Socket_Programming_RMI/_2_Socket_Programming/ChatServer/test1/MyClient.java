package com.jayshah.chapter_12_Socket_Programming_RMI._2_Socket_Programming.ChatServer.test1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        try {
            // make sure you give your machine IP Address : IPv4 Address = 192.168.56.1
            Socket socket = new Socket("192.168.56.1", 1111);

            OutputStream os = socket.getOutputStream();

            DataOutputStream dos = new DataOutputStream(os);

            String str1 = "Hello Server";
            dos.writeUTF(str1);

            dos.flush();

            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            String str2 = dis.readUTF();
            System.out.println("Message from server : " + str2);

            dos.close();
            os.close();
            socket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
