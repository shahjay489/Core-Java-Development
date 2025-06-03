package com.jayshah.chapter_15_Collection_Framework_Generics._12.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

class Student implements Comparable {
    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        // insert this object into Student
        // Student inherit Object class
        Student st = (Student) o;
        int i = this.name.compareTo(st.name);
        return i;
        //return -i; // descending/decrement order - start compare in that way
    }

    @Override
    public String toString() {
        return rollno + "-" + name;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Govardhan");
        Student s2 = new Student(102, "Dwarkesh");
        Student s3 = new Student(103, "Giriraj");
        Student s4 = new Student(104, "Mahaprabhuji");
        Student s5 = new Student(105, "Yamunaji");

        TreeSet ts = new TreeSet();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        System.out.println("sort according to name: "+ ts);
        // we have an object and in object has multiple data with different types.

        // -----------------------------------------------------------

        ArrayList al = new ArrayList();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        al.add(s5);
        Collections.sort(al);   // we have to sort using method
        System.out.println(al);
    }
}
