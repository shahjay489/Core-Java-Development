package com.jayshah.Chapter_12_Socket_Programming_RMI._3_RMI.rmidemo.Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddImplClass extends UnicastRemoteObject implements AddInterface {

    // exception may occur that is why we make constructor over here
    // so this will call the parent class constructor
    public AddImplClass() throws RemoteException {
        super();
    }

    public int add(int no1, int no2) {
        return no1 + no2;
    }
}