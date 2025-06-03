package com.jayshah.chapter_15_Collection_Framework_Generics._12.comparatordemo;

import java.util.Comparator;
import java.util.TreeSet;

// this is original class
class Student {
    int rollno;
    String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return rollno + "-" + name;
    }
}

class SortByName implements Comparator  //class SortByName extends Object implements Comparator
{
    /*
    here we do not need to override the equals method,
    which is in the Comparator
    but have to override compare method which is also in the Comparator in, why?
    - because Object class also has the equals method and in this parent class, it has given body/implementation part.
    that is why we do not need to make it here.
     */
    @Override
    public int compare(Object o1, Object o2) {
        Student ss = (Student) o1;
        Student sss = (Student) o2;
        int i = ss.name.compareTo(sss.name);
        return i;
//        return -i;    // descending order
    }
}

class SortByRollno implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student ss = (Student) o1;
        Student sss = (Student) o2;

        //'Integer(int)' is deprecated since version 9 and marked for removal
//        Integer i1 = new Integer(ss.rollno);
//        Integer i2 = new Integer(sss.rollno);
//        int i = i1.compareTo(i2);
//        return i; // ascending order
//        return -i; // descending order

        return Integer.compare(ss.rollno, sss.rollno);  // ascending order
//        return Integer.compare(sss.rollno, ss.rollno);    // descending order

    }
}

public class Test4 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Govardhan");
        Student s2 = new Student(102, "Dwarkesh");
        Student s3 = new Student(103, "Giriraj");
        Student s4 = new Student(104, "Mahaprabhuji");
        Student s5 = new Student(105, "Yamunaji");

        TreeSet ts = new TreeSet(new SortByName());
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        System.out.println("SortByName: " + ts);

        TreeSet ts1 = new TreeSet(new SortByRollno());
        ts1.add(s1);
        ts1.add(s2);
        ts1.add(s3);
        ts1.add(s4);
        ts1.add(s5);
        System.out.println("SortByRollno: " + ts1);

        // Now if you want sort according to Price then make one more class which sort it by Price
    }
}
