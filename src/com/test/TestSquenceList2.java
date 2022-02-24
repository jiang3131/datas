package com.test;

import com.company.SequenceList;

import java.util.Iterator;

public class TestSquenceList2 {
    public static void main(String[] args) {
        SequenceList<String> sa = new SequenceList<>(3);
        sa.insert("a");
        sa.insert("b");
        sa.insert("c");
        sa.insert("d");
        sa.insert("e");
        sa.insert("f");
        sa.insert("g");
        sa.insert("h");
        sa.insert("i");
        System.out.println(sa.getca());
        System.out.println("__________________________________________");
        sa.remove(1);
        sa.remove(2);
        sa.remove(3);
        sa.remove(4);
        sa.remove(5);
        sa.remove(6);
        sa.remove(0);
        System.out.println(sa.getca());


        Iterator it=sa.iterator();
        while(it.hasNext()){
            Object s1=it.next();
            System.out.println(s1);
        }




    }
}
