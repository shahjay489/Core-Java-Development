package com.jayshah.chapter_12_Socket_Programming_RMI._3_RMI.rmidemo.Client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AddInterface extends Remote {
    int add(int no1, int no2) throws RemoteException;
}

/*
    This is interface.
    not actual implementation class.
    Actual imp class is with the sever.
 */