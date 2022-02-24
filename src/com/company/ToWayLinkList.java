package com.company;

import java.util.Iterator;

public class ToWayLinkList<T> implements Iterable {
    private Node head;
    private Node last;
    private int N;
    private class Node{
        public T item;
        public Node pre;
        public Node next;
        public Node(T item,Node pre, Node next){
            this.item=item;
            this.pre=pre;
            this.next=next;
        }
    }
    public ToWayLinkList(){
        this.head=new Node(null,null,null);
        this.last=null;
        this.N=0;
    }
    public void clear(){
        this.head.next=null;
        this.head.item=null;
        this.head.pre=null;
        this.last=null;
        this.N=0;
    }
    public int length(){
        return N;
    }
    public boolean isEmpty(){
        return N==0;
    }
    public T getFirst(){
        if(isEmpty()){
            return null;
        }
        return head.next.item;
    }
    public T getLast(){
        if(isEmpty()){
            return null;
        }
        return last.item;
    }
    public void insert(T t){
        if(isEmpty()){
            Node newNode = new Node(t, head, null);
            last=newNode;
            head.next=last;
        }else{
            Node oldLast=last;
            Node newNode = new Node(t, oldLast, null);
            oldLast.next=newNode;
            last=newNode;
        }
        N++;
    }
    public void insert(int i ,T t){
        Node preNode=head;
        for(int index=i;index<=i-1;index++){
            preNode=preNode.next;
        }
        Node curr=preNode.next;
        Node newNode = new Node(t, preNode, curr);
        preNode.next=newNode;
        curr.pre=newNode;
        N++;
    }
    public T get(int i){
        Node n=head.next;
        for(int index=0;index<i;index++){
            n=n.next;
        }
        return n.item;
    }
    public T remove(int i){
        Node pre=head.next;
        for(int index=0;index<i-1;index++){
            pre=pre.next;
        }
        Node curr=pre.next;
        Node nextNode=curr.next;
        pre.next=nextNode;
        nextNode.pre=pre;
        N--;
        return curr.item;
    }
    public int indexOf(T t){
        Node n=head;
        for(int i=0;n.next!=null;i++){
            n=n.next;
            if(n.item.equals(t)){
                return i;
            }

        }
        return -1;
    }

    @Override
    public Iterator iterator() {
        return new TIerator();
    }
    private class TIerator implements Iterator{
        private Node n;
        public TIerator(){
            this.n=head;
        }
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
