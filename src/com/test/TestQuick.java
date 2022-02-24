package com.test;

import com.company.Quick;

import java.util.Arrays;

public class TestQuick {
    public static void main(String[] args) {
        Integer[] a={9,8,7,6,5,4,3,2,1,0,-1,-2,-3,-4};
        Quick.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
