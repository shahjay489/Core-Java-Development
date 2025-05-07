package com.jayshah.chapter_10_Java_InputOutput_Serialization._6_Serialization.SerDerDemo;

import java.io.*;

/*
    Here we need to make "no argument constructor"
 */
class Employee implements Externalizable {
    String name;
    int empid;
    String email;
    String phoneno;

    public Employee() {
    }

    public Employee(String name, int empid, String email, String phoneno) {
        this.name = name;
        this.empid = empid;
        this.email = email;
        this.phoneno = phoneno;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        // modify data
        String[] new_email = email.split("@");
        String new_email1 = new_email[0];

        String[] new_phno = phoneno.split(" ");
        String new_phno1 = new_phno[1];

        // we need to write all variables which Serialize
        // and in the same sequence we need to read it too
        // check readExternal() method
        out.writeUTF(name);
        out.writeInt(empid);
        out.writeUTF(new_email1);
        out.writeUTF(new_phno1);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        // instance variable : when we read at the same it will store, variables already declared
        name = in.readUTF();
        empid = in.readInt();
        email = in.readUTF() + "@gmail.com";
        phoneno = "+91 " + in.readUTF();
    }

    void show() {
        System.out.println("Name : " + name);
        System.out.println("Empid : " + empid);
        System.out.println("Email : " + email);
        System.out.println("Phone No : " + phoneno);
    }
}

public class ExtDemo {
    public static void main(String[] args) throws Exception {

        //-------------------Serialization----------------------------------------

        Employee emp1 = new Employee("govardhan", 101, "govardhan@gmail.com", "+91 6253830308");
        FileOutputStream fos = new FileOutputStream("E:\\serdes\\emp.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(emp1);

        //-------------------------------- Deserialization---------------------------------------------

        FileInputStream fis = new FileInputStream("E:\\serdes\\emp.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee empp = (Employee) ois.readObject();    // this will call no argument constructor
        empp.show();
    }
}
