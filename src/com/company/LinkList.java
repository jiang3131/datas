package com.company;


import java.util.Iterator;

public class LinkList<T> implements Iterable<T>{
    private Node head;
    private int N;



    private class Node{
        T item;
        Node next;
        public Node(T item, Node next){
            this.item=item;
            this.next=next;
        }
    }
    public LinkList(){
        this.head=new Node(null,null);
        this.N=0;
    }
    public void clear(){
        head.next=null;
        this.N=0;
    }
    public int length(){return N;}
    public boolean isEmpty(){return N==0 ;}
    public T get(int i){
        Node n=head.next;
        for(int index=0;index<i;index++){
            n=n.next;
        }
        return n.item;
    }
    public void insert(T t){
        Node n=head;
        while(n.next!=null){
            n=n.next;
        }
        Node newNode = new Node(t, null);
        n.next=newNode;
        N++;
    }
    public void insert(int i,T t){
        Node pre=head;
        for(int index=0;i<i;i++){
            pre=pre.next;
        }
         Node curr=pre.next;
        Node newNode = new Node(t, curr);
        pre.next=newNode;
        N++;
    }
    public T remove(int i){
        Node node=head;
        for(int index=0;i<=i-1;i++){
            node=node.next;
        }
        Node curr=node.next;
        Node nextNode = curr.next;
        node.next=nextNode;
        N--;
        return curr.item;


    }
    public int indexOf(T t){
        Node n=head;
        for (int index=0;n.next!=null;index++){
            n=n.next;
            if(n.item.equals(t)){
                return index;
            }

        }
        return -1;
    }
    @Override
    public Iterator<T> iterator() {
        return new LIterator();
    }
    private class LIterator implements Iterator{
       private  Node n=head;
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
    public void reverse(){
        if(isEmpty()){
            return;
        }
        reverse(head.next);
    }
    public Node reverse(Node curr){
        if(curr.next==null){
            head.next=curr;
            return curr;
        }
        Node pre = reverse(curr.next);
        pre.next=curr;
        curr.next=null;
        return curr;
    }


}
