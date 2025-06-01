package com.jayshah.chapter_15_Collection_Framework_Generics._10.sortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test7
{
    public static void main(String[] args)
    {
        SortedSet ss=new TreeSet();

//        ss.add("Mahaprabhuji");
//        ss.add("Govardhan");
//        ss.add("Dwarkesh");
//        ss.add("Yamunaji");
//        ss.add("Girirajji");
        ss.add("aaa");
        ss.add("bbb");
        ss.add("ccc");
        ss.add("ddd");
        ss.add("eee");
        
        System.out.println(ss);
        //System.out.println(ss.first());       //aaa
        //System.out.println(ss.last());          //eee
        //System.out.println(ss.headSet("ccc"));    //[aaa, bbb] - does not include itself
        //System.out.println(ss.tailSet("ccc"));    //[ccc, ddd, eee] - include the provided object also
        System.out.println(ss.subSet("bbb", "eee"));    //[bbb, ccc, ddd]
    }
}
