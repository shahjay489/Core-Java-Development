package com.jayshah.chapter_15_Collection_Framework_Generics._12.demo;

import java.util.TreeSet;

class Student1 implements Comparable {
    int rollno;
    String name;

    public Student1(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Student1 st = (Student1) o;
/*
        // Understand this --------------

        //'Integer(int)' is deprecated since version 9 and marked for removal
        Integer i1 = new Integer(this.rollno);
        Integer i2 = new Integer(st.rollno);


//        if (i1 > i2) {
//            return 1;
//        } else if (i1 < i2) {
//            return -1;
//        } else {
//            return 0;
//        }
        // you can do compare logic manually - above way
        // or use method directly.
        int val = i1.compareTo(i2);
        return val; // ascending order
        //return -val; // descending order

        */

        return Integer.compare(this.rollno, st.rollno); // ascending order
//        return Integer.compare(st.rollno, this.rollno); // descending order
    }

    @Override
    public String toString() {
        return rollno + "-" + name;
    }
}

public class Test3 {
    public static void main(String[] args) {
        Student1 s1 = new Student1(101, "Govardhan");
        Student1 s5 = new Student1(105, "Dwarkesh");
        Student1 s3 = new Student1(103, "Giriraj");
        Student1 s4 = new Student1(104, "Mahaprabhuji");
        Student1 s2 = new Student1(102, "Yamunaji");

        TreeSet ts = new TreeSet();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        System.out.println(ts);
    }
}
