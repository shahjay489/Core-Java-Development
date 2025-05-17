package com.jayshah.Chapter_12_Socket_Programming_RMI._3_RMI.rmidemo.Server;

import java.rmi.Naming;

public class Server {
    public static void main(String[] args) {
        try {
            AddImplClass obj = new AddImplClass();
            Naming.rebind("rmi://192.168.56.1:1111/aaa", obj);
            System.out.println("Server started");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/*
	rebind() : this method is a static method and it is in the java.rmi package.

-------------------------------------------------

    in registry table, object name and its global name. (See diagram)
    here, aaa is a global name we gave.

    Naming.rebind("rmi://192.168.29.175:1111/aaa", obj);

	- if you are working on localhost then you can simply write
		Naming.rebind("aaa",obj);

    here we bind obj in the registry table and its global name is aaa we gave.
    This object is created in the server.

 */