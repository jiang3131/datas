package com.test;

import com.company.Selection;

import java.nio.channels.SelectableChannel;
import java.util.Arrays;

public class TestSelection {
    public static void main(String[] args) {
        Integer[] arr={2,4,3,5,6,1,7,9,8,10};
        Selection.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
