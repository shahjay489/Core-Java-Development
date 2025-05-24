package com.jayshah.chapter_12_Socket_Programming_RMI._2_Socket_Programming.SocketProgrammingDemo.spclient;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        try {
//            Socket socket = new Socket("192.168.29.175", 1111);
            Socket socket = new Socket("192.168.56.1", 1111);

            OutputStream os = socket.getOutputStream();

            DataOutputStream dos = new DataOutputStream(os);

            String str = "Hello Server";
            dos.writeUTF(str);

            dos.flush();

            dos.close();
            os.close();
            socket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/*
    getOutputStream(), getInputStream() : Methods of the Socket
    Both sockets are same(client side and server side)
    It is copy of each other
 */