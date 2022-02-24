package com.test;

import com.company.Shell;

import java.util.Arrays;

public class TestShell {
    public static void main(String[] args) {
        Integer[] a={2,1,3,6,5,4,7,9,8,10,11,4,3};
        Shell.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
