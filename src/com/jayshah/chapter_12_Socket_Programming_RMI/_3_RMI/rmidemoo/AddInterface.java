package com.jayshah.chapter_12_Socket_Programming_RMI._3_RMI.rmidemoo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AddInterface extends Remote
{
	public int add(int no1, int no2) throws RemoteException;
}