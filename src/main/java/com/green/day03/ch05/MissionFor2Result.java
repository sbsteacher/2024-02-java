package com.green.day03.ch05;

public class MissionFor2Result {
    public static void main(String[] args) {
        /*
        구구단 5단을 출력하는 프로그램을 for문을 이용해서 작성해주세요.

        5 x 1 = 5
        5 x 2 = 10
        5 x 3 = 15
        ...
        5 x 9 = 45

        */
        int dan = 5; //매직 넘버
        for(int i=1; i<10; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
        }

    }
}
