package com.green.day08.ch13;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = new int[20];
        //1~20순차적으로 값을 넣어주세요.
        for(int i=0; i<arr.length; i++) {
            arr[i] = i + 1;
        }

        //0 ~ 19 랜덤값
        for(int i=0; i<arr.length; i++) {
            int rIdx = (int)(Math.random() * arr.length);
            int temp = arr[i];
            arr[i] = arr[rIdx];
            arr[rIdx] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
