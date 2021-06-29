package com.sort;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[9]=9;
        for (int i : arr) {
            System.out.println(i);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

//    public Arrays[] mysort(Arrays[] num){
//        return Arrays.sort(num);
//    }
}
