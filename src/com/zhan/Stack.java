package com.zhan;

import java.util.Iterator;

public class Stack<T> implements Iterable<T>{
    private Node head;
    private int N;

    private class Node{
       public  T item;
       public Node next;
        public Node(T item,Node next){
            this.item=item;
            this.next=next;
        }
    }
    public Stack(){
        this.head=new Node(null,null);
        this.N=0;
    }
    public boolean isEmpty(){
        return N==0;
    }
    public int size(){
        return N;
    }
    public void push(T t){
        Node oldfirst = head.next;
        Node newNode = new Node(t, null);
        head.next=newNode;
        newNode.next=oldfirst;
        N++;

    }
    public T pop(){
        Node oldfirst=head.next;
            if(oldfirst==null){
                return null;
            }
            head.next=oldfirst.next;
            N--;
            return oldfirst.item;
    }

    @Override
    public Iterator<T> iterator() {
        return new myIterator();
    }
    private class myIterator implements Iterator{
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
