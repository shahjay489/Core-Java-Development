package com.jayshah.chapter_15_Collection_Framework_Generics._12.casesdemo;

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
        /*
            Remember always:

            public int compareTo(Object obj)
            - obj1.compareTo(obj2);
            - +ve - if obj1 is greater than obj2
            - -ve - if obj2 is greater than obj1
            - 0 - if obj1 is equals to obj2
         */

        Student st = (Student) o;
        return this.name.compareTo(st.name);  // ascending order
        //return -this.name.compareTo(st.name); // descending order

        //return 1;   // return based on insertion order
        //return -1;   // return based on reverse order (back side)
        //return 0;   // return only one value

        /*
            here it compares but everytime, and it returns 1 so first value, whatever it has,
            it considers always bigger

            here it compares but everytime, and it returns -1 so first value, whatever it has,
            it considers always smaller

        */
    }

    @Override
    public String toString() {
        return rollno + "-" + name;
    }
}

public class Test1 {
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
        System.out.println(ts);
    }
}