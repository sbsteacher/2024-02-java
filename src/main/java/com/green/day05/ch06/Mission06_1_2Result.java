package com.green.day05.ch06;

public class Mission06_1_2Result {
    static void abs(int n1, int n2) {
        int r = n1 - n2;
        System.out.println(r < 0 ? -r : r);
    }

    static void abs2(int n1, int n2) {
        System.out.println(n1 > n2 ? n1 - n2 : n2 - n1);
    }

    public static void main(String[] args) {
        /*
        정수 둘을 인자로 전달받아서, 두 수의 '차의 절대값'을 계산하여 출력하는
        메소드와 이 메소드를 호출하는 main 메소드를 정의해 보자. 단 메소드 호출
        시 전달되는 값의 순서에 상관없이 절대값이 계산되고 출력되어야 한다.
        */
        abs2(10, 3);
        abs2(3, 10);
        System.out.println("-----");
        abs2(11, 7);
        abs2(7, 11);
    }
}
