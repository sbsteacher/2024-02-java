package com.green.day02.ch05;

public class MissionIf2 {
    public static void main(String[] args) {
        int score = (int)(Math.random() * 101.0); //0이상 100이하의 랜덤값 나올 수 있도록 세팅
        System.out.printf("score: %d\n", score);

        /*
        score값이 90이상이면 A 출력
                  80이상이면 B 출력
                  70이상이면 C 출력
                  나머지는 D 출력
         */
    }
}
