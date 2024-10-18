package com.green.day09.ch13;

//p.296
public class EnhancedFor {
    //향상된 for문, 강화된 for문, foreach문
    public static void main(String[] args) {
        int[] arr = { 10, 22, 7, 4, 80 };

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("-----------");

        for(int item : arr) {
            System.out.println(item);
        }

        /*
            sequence가 있는 콜렉션에서 사용가능하다.
            0, 1, 2번방 같은 순차적으로 값을 읽어오고 쓰는 콜렉션에서는 사용가능하다.
            Array(배열), ArrayList 에서 사용 가능

            보통 값을 읽어올 때 사용한다.
            enhanced for문은 아래처럼 동작한다.
            자동으로 마지막 인덱스값까지 반복한다.

            int item = arr[0];
            System.out.println(item);

            int item = arr[1];
            System.out.println(item);

            int item = arr[2];
            System.out.println(item);

         */
    }
}
