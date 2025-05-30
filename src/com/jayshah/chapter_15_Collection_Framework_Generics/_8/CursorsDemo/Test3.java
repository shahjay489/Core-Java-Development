package com.jayshah.chapter_15_Collection_Framework_Generics._8.CursorsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Test3 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add("Govardhan");
        al.add("Dwarkesh");
        al.add("Giriraj");
        al.add("Yamunaji");

        //ArrayList al1=new ArrayList();

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
//            System.out.println(itr.next());

            String element = (String) itr.next();
            if (element.equals("Giriraj")) {
                itr.remove();
                System.out.println("Element removed successfully");
            }
//            else
//            {
//                al1.add(element);
//            }
        }
        //System.out.println(al1);
    }
}
