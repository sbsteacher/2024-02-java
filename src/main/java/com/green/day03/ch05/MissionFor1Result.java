package com.green.day03.ch05;

public class MissionFor1Result {
    public static void main(String[] args) {
        /*
            1부터 10까지의 곱의 결과를 출력하는 프로그램을 for문을 이용해서 작성
            3,628,800
        */
        int n = 1;
        for(int i=2; i<=10; i++) {
            //n = n * i;
            n *= i;
        }
        System.out.printf("%,d\n", n);
    }
}
