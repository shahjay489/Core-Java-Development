package com.jayshah.Chapter_12_Socket_Programming_RMI._2_Socket_Programming.ChatServer.test2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket serversocket = new ServerSocket(2222);
            System.out.println("Server is waiting for client");
            Socket socket = serversocket.accept();
            System.out.println("Client found");
            System.out.println("---------------------------------------------------");

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // for taking user input

            String str1 = "", str2 = "";
            while (!str1.equals("bye")) {
                str2 = dis.readUTF();
                System.err.println("Client Says : " + str2);    // just for changing the red color we use err otherwise we are using err only for error

                str1 = br.readLine();
                dos.writeUTF(str1);
                dos.flush();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
