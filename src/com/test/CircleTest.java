package com.test;

import com.company.LinkList;

import java.util.LinkedList;

public class CircleTest {
    public static void main(String[] args) {
        LinkList<String> sa=new LinkList();
        sa.insert("aa");
        sa.insert("bb");
        sa.insert("cc");
        sa.insert("dd");
        sa.insert("ee");
        sa.insert("ff");
        sa.insert("gg");
        sa.insert("hh");
        LinkList<String>.Node n1 = sa.getNode(7);
        boolean iscircle = sa.iscircle(sa.getNode(1));
        System.out.println(iscircle);
        n1.next=sa.getNode(3);
        boolean iscircle2 = sa.iscircle(sa.getNode(1));
        System.out.println(iscircle2);
        LinkList<String>.Node entrance = sa.getEntrance(sa.getNode(1));
        System.out.println(entrance.item);


    }
}
