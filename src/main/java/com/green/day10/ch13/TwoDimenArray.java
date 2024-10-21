package com.green.day10.ch13;

// Two Dimension Array 2차원 배열
public class TwoDimenArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][5]; //2차원, 배열 안에 배열
        int[][] arr3 = {
            {0, 0, 8, 14, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}
        };


        /*
        arr, arr3의 각 방의 타입은 int[] (int 1차원 배열)이다.
         */
        System.out.println("arr.length: " + arr.length);
        System.out.println("arr3.length: " + arr3.length);

        int[] tmp1 = arr3[0];
        System.out.println("tmp1[2]: " + tmp1[2]);
        System.out.println("arr3[0][2]: " + arr3[0][2]);

        int[] tmp2 = {0, 0, 8, 14, 0};
        System.out.println("tmp2[2]: " + tmp2[2]);

        int n = 1;
        for(int i=0; i<arr.length; i++) {
            for(int i2=0; i2<arr[0].length; i2++) {
                arr[i][i2] = n++;
            }
        }
        System.out.println("-------------------------");
        for(int i=0; i<arr.length; i++) {
            for (int i2 = 0; i2 < arr[0].length; i2++) {
                System.out.printf("%d\t", arr[i][i2]);
            }
            System.out.println();
        }
        System.out.println("==========================");
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[2][0]);





        int[][][] arr2 = new int[3][5][2]; //3차원
        /*
        arr2의 각 방의 타입은 int[][] (int 2차원 배열)

         */
    }
}
