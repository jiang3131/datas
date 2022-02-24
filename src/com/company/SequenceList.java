package com.company;

import java.util.Iterator;

public class SequenceList<T> implements Iterable {
    private T[] eles;
    private int N;
    private int capacity;
    public SequenceList(int capacity){
        this.capacity=capacity;
        this.eles=(T[]) new Object[this.capacity];
        this.N=0;
    }
    public int getca(){
        return this.capacity;
    }
    public void clear(){
        for(int i=0;i<N;i++){
            eles[i]=null;
        }
        this.N=0;
    }
    public boolean isEmpty(){
        return N==0;
    }
    public int length(){
        return N;
    }
    public T get (int i){
        return eles[i];
    }
    public void insert(T t){
        eles[N++]=t;
        if(N>=this.capacity-1){
            this.capacity=this.capacity*2+1;
            T[] eles2=(T[])new Object[this.capacity];
            for(int i=0;i<N;i++){
                eles2[i]=eles[i];
            }
            eles=eles2;
        }

    }
    public void insert(int j,T t ){
        for(int index=N;index>j;index--){
            eles[index]=eles[index-1];
        }
        eles[j]=t;
        this.N++;
        if(N>=this.capacity-1){
            this.capacity=this.capacity*2+1;
            T[] eles2=(T[])new Object[this.capacity];
            for(int i=0;i<N;i++){
                eles2[i]=eles[i];
            }
            eles=eles2;
        }
    }
    public T remove(int i){
        T current =eles[i];
        for(int index=i;index<N-1;index++){
            eles[index]=eles[index+1];
        }
        N--;
        if(N<=this.capacity/2-1){
            this.capacity=this.capacity/2;
            T[] eles3=(T[])new Object[this.capacity];
            for(int j=0;j<N;j++){
                eles3[j]=eles[j];
            }
            eles=eles3;
        }
        return current;
    }
    public int indexof(T t){
        for(int i=0;i<N;i++){
            if(eles[i].equals(t));
            return i;
        }
        return -1;
    }

    @Override
    public Iterator iterator() {
        return new SIterator();
    }
    private class SIterator implements Iterator{
        private int curse;
        public SIterator(){
            this.curse=0;
        }

        @Override
        public boolean hasNext() {
            return curse<N;
        }

        @Override
        public Object next() {
            return eles[curse++];
        }
    }
}
