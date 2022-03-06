package com.fuhaobiao;

public class SymbolTable<Key,Value> {
    private Node head;
    private int N;
    private class Node<Key,Value>{
        public Key key;
        public Value value;
        public Node next;
        public Node(Key key,Value value,Node next){
            this.key=key;
            this.value=value;
            this.next=next;
        }
    }
    public SymbolTable(){
        this.head=new Node(null,null,null);
        this.N=0;
    }
    public Value get(Key key){}
    public void put(Key key,Value value){
        Node n=head;
        while(n.next!=null){
            
        }

    }
    public void delete(Key key){}
    public int size(){
        return N;
    }

}
