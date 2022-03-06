package com.duilie;

import java.util.Iterator;

public class Queue<T> implements Iterable {
    private Node head;
    private Node last;
    private  int N;
    private class Node{
        public  T item;
        public     Node next;
         public Node(T item,Node next){
             this.item=item;
             this.next=next;
         }
    }
    public Queue(){
        this.head=new Node(null,null);
        this.last=null;
        this.N=0;
    }
    public boolean isEmpty(){
        return N==0;
    }
    public int size(){
        return N;
    }
    //拿出一个元素
    public T dequeue(){
        if(isEmpty()){
            return null;
        }
        Node oldfirst=head.next;
        head.next=oldfirst.next;
        N--;
        if(isEmpty()){
            last=null;
        }
        return  oldfirst.item;
    }
    //插入一个元素
    public void enqueue(T t){
        if(last==null){
            last=new Node(t,null);
            head.next=last;
        }else{
            Node oldlast=last;
            last=new Node(t,null);
            oldlast.next=last;
        }
        N++;

    }

    @Override
    public Iterator iterator() {
        return new QIterator();
    }
    private class QIterator implements Iterator{
        Node n=head;
        @Override
        public boolean hasNext() {
            return n.next!=null;
        }

        @Override
        public Object next() {
            n=n.next;
            return n.item;
        }
    }
}
