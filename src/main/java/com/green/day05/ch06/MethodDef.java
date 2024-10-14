package com.green.day05.ch06;

public class MethodDef {

    static void hiEveryone(int age) {
        System.out.printf("좋은 아침입니다.\n제 나이는 %d세 입니다.\n", age);
    }

    public static void main(String[] args) {
        System.out.println("프로그램의 시작");

        hiEveryone(11);
        /*
        좋은 아침입니다.(개행)
        제 나이는 12세 입니다.
         */
        hiEveryone(30);
        /*
        좋은 아침입니다.(개행)
        제 나이는 13세 입니다.
        */
        System.out.println("프로그램의 끝");
    }
}
