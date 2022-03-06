package com.zhan.test;

import com.zhan.Stack;

public class testStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
       for(Object item : stack){
           System.out.println(item);
       }
        System.out.println("__________________________");
        String result=stack.pop();
        System.out.println(result);
        System.out.println(stack.size());


    }
}
