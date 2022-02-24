package com.test;

import com.company.LinkList;

import java.util.Iterator;

public class TestLinklist {
    public static void main(String[] args) {
        LinkList<String> ls = new LinkList<>();
        ls.insert("a");
        ls.insert("b");
        ls.insert("c");
        ls.insert("d");
        ls.insert("e");
        ls.insert("f");
        ls.insert("g");

        ls.remove(1);
        ls.insert(1,"a");

        ls.reverse();
        Iterator it=  ls.iterator();
        while(it.hasNext()){
            String s1=(String)it.next();
            System.out.println(s1);
        }
        for (String s: ls
             ) {
            System.out.println(s);

        }

    }
}
