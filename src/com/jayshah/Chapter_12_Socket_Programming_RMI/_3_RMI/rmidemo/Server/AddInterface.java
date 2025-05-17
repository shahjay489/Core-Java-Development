package com.jayshah.Chapter_12_Socket_Programming_RMI._3_RMI.rmidemo.Server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AddInterface extends Remote {
	int add(int no1, int no2) throws RemoteException;
}