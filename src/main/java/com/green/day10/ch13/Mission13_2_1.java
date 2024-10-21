package com.green.day10.ch13;

import java.util.Arrays;

public class Mission13_2_1 {
    /*
    다음 메소드는 int형 1차원 배열에 저장된 값을 두 번째 매개변수로 전달된 값의
    크기만큼 전부 증가시킨다.

    public static void addOneDArr(int[] arr, int add) {

    }
     */
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(arr)); // [ 1, 2, 3, 4, 5 ]
//        for(int item : arr) {
//            item += 3;
//        }
//        for(int i=0; i<arr.length; i++) {
//            int item = arr[i];
//            item = item + 3;
//        }
        //위의 2개 for문은 배열이 가지고 있는 값을 다른데로 복사로하고 다른데를 고친다.
        // 배열의 각 방의 값을 고쳐야 하는데 다른 곳을 수정한다.
        // 그래서 배열이 내용이 바뀌지 않는다.
        // 고로, 아래처럼 해야 한다.
//        for(int i=0; i<arr.length; i++) {
//            arr[i] = arr[i] + 3;
//        }

        addOneDArr(arr, 5); //두번째 인자의 값을 모든 방에 더해준다.
        System.out.println(Arrays.toString(arr)); // [ 4, 5, 6, 7, 8 ]


    }

    public static void addOneDArr(int[] arr, int add) {
        for(int i=0; i<arr.length; i++) {
            arr[i] = arr[i] + add;
        }
    }

}
