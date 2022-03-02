package com.test;

import com.company.LinkList;

import java.util.Iterator;

public class JosephTest {
    private static class Node<T> {
        T item;
        Node next;
        private Node(T item,Node next){
            this.item=item;
            this.next=next;
        }
    }
     public static void main(String[] args) {
        Node<Integer> first=null;
         Node<Integer> pre=null;
         for (int i = 1; i <=41 ; i++) {
             if(i==1){
                 first = new Node<>(i, null);
                 pre =first;
                 continue;
             }
             Node<Integer> newNode=new Node<>(i,null);
             pre.next=newNode;
             pre=newNode;
             if(i==41){
                 pre.next=first;
             }
         }
         Node<Integer> n=first;
         Node<Integer> before=null;
         int count=0;
         while(n!=n.next){
             count++;
             if(count==3){
                 before.next=n.next;
                 System.out.print(n.item+" ");
                 count=0;
                 n=n.next;
             }else{
                 before=n;
                 n=n.next;
             }
         }
         System.out.println(n.item);





     }
}
