package com.test;

import com.company.Bubble;

import java.util.Arrays;

public class TestBubble {
    public static void main(String[] args) {
        Integer[] arr={3,2,1,4,6,5};
        Bubble.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
