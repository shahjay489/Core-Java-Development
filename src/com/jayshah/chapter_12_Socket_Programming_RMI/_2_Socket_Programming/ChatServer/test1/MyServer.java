package com.jayshah.chapter_12_Socket_Programming_RMI._2_Socket_Programming.ChatServer.test1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket serversocket = new ServerSocket(1111);
            System.out.println("Server is waiting for client");

            Socket socket = serversocket.accept();
            System.out.println("Client found");

            InputStream is = socket.getInputStream();

            DataInputStream dis = new DataInputStream(is);
            String str = dis.readUTF();

            System.out.println("Message from client : " + str);

            String str2 = "Hello Client...!!";
            OutputStream os = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(str2);
            dos.flush();

            dis.close();
            is.close();
            socket.close();
            serversocket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
