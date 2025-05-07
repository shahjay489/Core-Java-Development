package com.jayshah.chapter_10_Java_InputOutput_Serialization._6_Serialization.SerDerDemo;

import java.io.*;

// Serializable interface / marker interface
class Aa implements Serializable {

}

class Student extends Aa {
    String name;
    int rollno;
    String school;

    public Student(String name, int rollno, String school) {
        System.out.println("111111");
        this.name = name;
        this.rollno = rollno;
        this.school = school;
    }

    public void show() {
        System.out.println("------------Student Details-------------");
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollno);
        System.out.println("School : " + school);
    }
}

public class Test {
    public static void main(String[] args) throws Exception {
        //-------------------Serialization----------------------------------------
        FileOutputStream fos = new FileOutputStream("E:\\serdes\\student.txt"); // if you are taking into remote machine then here you do not need to mention path.
        // If you are store in the local storage/machine then you have to mention the path.

        Student s1 = new Student("Govardhan", 101, "Pushtimarg");

        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);

        //-------------------Deserialization------------------------------------

        FileInputStream fis = new FileInputStream("E:\\serdes\\student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s = (Student) ois.readObject();
        s.show();
    }
}

/*
    Object Serialization concept already implemented in this => ObjectOutputStream oos = new ObjectOutputStream(fos);

    -> ObjectOutputStream does Serialization because of extend Serialization


    Serialization : this data normally we can not read.
    We need to convert into the Deserialization then we can read it.


    ---------------------

    Student s = (Student) ois.readObject();
    here, ois.readObject(); return the value in the Object form
    that is why we cast in the Student

 */