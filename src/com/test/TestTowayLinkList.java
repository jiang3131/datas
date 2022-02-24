package com.test;

import com.company.ToWayLinkList;

import java.util.Iterator;

public class TestTowayLinkList {
    public static void main(String[] args) {
        ToWayLinkList<String> tl = new ToWayLinkList<>();
        tl.insert("a");
        tl.insert("b");
        tl.insert("c");
        tl.insert("d");
        tl.insert("e");
        tl.insert("f");

        tl.insert(1,"a");
        tl.remove(1);
        System.out.println(tl.indexOf("b"));
        System.out.println(tl.get(2));
        System.out.println(tl.getFirst());
        System.out.println(tl.getLast());
        Iterator it=tl.iterator();
        while(it.hasNext()){
            String s1=(String) it.next();
            System.out.println(s1);
        }
        tl.clear();
        System.out.println(tl.getFirst());
        System.out.println(tl.getLast());


    }
}
