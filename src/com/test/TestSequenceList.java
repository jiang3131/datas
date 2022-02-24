package com.test;

import com.company.SequenceList;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestSequenceList {
    public static void main(String[] args) {

        SequenceList<String> se=new SequenceList<>(10);
        se.insert("a");
        se.insert("b");
        se.insert("c");
        se.insert("d");
        se.insert("e");
        se.insert(1,"kk");
        for (Object o : se) {
            System.out.println(o);
        }
        System.out.println("_________________");
        Iterator it=se.iterator();
        while(it.hasNext()){
            Object s1=it.next();
            System.out.println(s1);
        };
        System.out.println("-------------------------------------------");

        System.out.println(se.get(1));
        System.out.println(se.get(4));
        System.out.println(se.remove(1));
        System.out.println(se.length());
        se.clear();
        System.out.println(se.length());
        System.out.println(se.get(1));

    }
}
