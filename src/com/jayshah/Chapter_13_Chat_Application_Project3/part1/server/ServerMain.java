package com.jayshah.Chapter_13_Chat_Application_Project3.part1.server;


public class ServerMain {
    public static void main(String[] args) {
        Server s = new Server();    // this will open frontend part
        s.waitingForClient(); // waiting for client
    }
}
