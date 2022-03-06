package com.zhan.test;

import com.zhan.Stack;

public class BracksMatchTest {
    public static void main(String[] args) {
        String str="((长安))()";
        boolean match =isMatch(str);
        System.out.println(str+"中的括号是否匹配"+match);
    }
    public static boolean isMatch(String str){
        Stack<String> chars = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            String currchar=str.charAt(i)+ "";
            if(currchar.equals("(")){
                chars.push(currchar);
            }else if(currchar.equals(")")){
                String pop=chars.pop();
                if(pop==null){
                    return false;}
            }
        }
        if(chars.size()==0){
            return true;
        }else
        { return false;}
    }
}
