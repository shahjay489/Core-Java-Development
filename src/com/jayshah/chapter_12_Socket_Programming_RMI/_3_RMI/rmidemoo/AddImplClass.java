package com.jayshah.chapter_12_Socket_Programming_RMI._3_RMI.rmidemoo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddImplClass extends UnicastRemoteObject implements AddInterface
{
	public AddImplClass() throws RemoteException
	{
		super();
	}
	public int add(int no1, int no2)
	{
		return no1+no2;
	}
}