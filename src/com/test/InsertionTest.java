package com.test;

import com.company.Insertion;

import java.util.Arrays;

public class InsertionTest {
    public static void main(String[] args) {
        Integer[] a={4,5,2,6,7,9,8,20};
        Insertion.srot(a);
        System.out.println(Arrays.toString(a));
    }
}
