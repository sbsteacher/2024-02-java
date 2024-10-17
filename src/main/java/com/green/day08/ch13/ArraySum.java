package com.green.day08.ch13;

public class ArraySum {
    public static void main(String[] args) {

        int[] arr = { 10, 15, 23, 1, 8 };
        //arr에 들어있는 모든 정수를 더한 값을 출력해 주세요.
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            //sum = sum + arr[i];
            sum += arr[i];
        }

        System.out.println("sum: " + sum);
    }
}
