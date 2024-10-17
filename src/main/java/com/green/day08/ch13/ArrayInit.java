package com.green.day08.ch13;

public class ArrayInit {
    public static void main(String[] args) {
        int[] arr = new int[5];
        /*
        0: 10   >> arr[0] = 10   >> arr[0] = 1
        1: 20   >> arr[1] = 20   >> arr[1] = 2
        2: 30
        3: 40
        4: 50
         */
        for(int i=0; i<arr.length; i++) {
            arr[i] = (i + 1) * 10;
        }

        //건드리지 마시오.
        for(int i=0; i<arr.length; i++) {
            System.out.printf("arr[%d]: %d\n", i, arr[i]);
        }
    }
}
