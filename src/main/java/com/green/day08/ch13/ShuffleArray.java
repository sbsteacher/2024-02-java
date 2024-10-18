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
        //rIdx가 가리키는 공간과 i가 가리키는 공간의 값을 swapp해주세요.
        //20번 반복하면 값이 섞이게 된다.
        for(int i=0; i<arr.length; i++) {
            int rIdx = (int)(Math.random() * arr.length);
            int temp = arr[i];
            arr[i] = arr[rIdx];
            arr[rIdx] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
