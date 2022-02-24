package com.test;

import com.company.Merge;

import java.util.Arrays;

public class Testmerge {
    public static void main(String[] args) {
        Integer[] a={3,4,2,123,45,6,77,5,44,3};
        Merge.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
