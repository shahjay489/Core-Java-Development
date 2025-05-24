package com.jayshah.chapter_12_Socket_Programming_RMI._3_RMI.rmidemo.Client;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("192.168.56.1", 1111);
            AddInterface ai = (AddInterface) Naming.lookup("aaa");
            System.out.println(ai.add(100, 200));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}