package com.green.day08.ch13;

import java.util.Arrays;

public class ArrayDataSwapping {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30 };
        int temp;

        temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;
        //arr[0]방의 값과 arr[2]의 값을 swapping해주세요.

        System.out.println(Arrays.toString(arr));
    }
}
