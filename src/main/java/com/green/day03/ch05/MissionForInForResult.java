package com.green.day03.ch05;

public class MissionForInForResult {
    public static void main(String[] args) {
        /*
        중첩 for문을 이용하여 구구단을 출력해 주세요.

        2 x 1 = 2
        2 x 2 = 4
        2 x 3 = 6
        ...
        2 x 9 = 18
        (개행)
        3 x 1 = 3
        3 x 2 = 6
        ...
        9 x 9 = 81
         */

        for(int dan=2; dan<10; dan++) {
            for(int i=1; i<10; i++) {
                System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
            }
            System.out.println();
        }
    }
}
