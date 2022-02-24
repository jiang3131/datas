package com.test;

public class TestFactorial {
    public static void main(String[] args) {
        long a = factorial(5);
        System.out.println(a);
    }
    public static  long factorial(int n){
        if(n==1){
            return 1;
        }else
            return n*factorial(n-1);
    }
}
