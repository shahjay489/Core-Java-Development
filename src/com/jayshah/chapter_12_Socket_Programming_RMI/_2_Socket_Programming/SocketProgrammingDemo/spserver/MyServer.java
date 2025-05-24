package com.jayshah.chapter_12_Socket_Programming_RMI._2_Socket_Programming.SocketProgrammingDemo.spserver;

import java.io.DataInputStream;
import java.io.InputStream;
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

            dis.close();
            is.close();
            socket.close();
            serversocket.close();
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