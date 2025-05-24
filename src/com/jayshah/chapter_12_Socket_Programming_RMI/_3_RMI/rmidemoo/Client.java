package com.jayshah.chapter_12_Socket_Programming_RMI._3_RMI.rmidemoo;

import java.rmi.Naming;

public class Client
{
	public static void main(String[] args)
	{
		try
		{
			AddInterface ai=(AddInterface) Naming.lookup("aaa");
			System.out.println(ai.add(100, 200));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}