package com.green.day03.ch05;

public class MissionForInFor2Result {
    public static void main(String[] args) {
        /*
        중첩 for문을 이용하여 구구단을 출력해 주세요.

        2 x 1 = 2 \t  3 x 1 = 3  ..... 9 x 1 = 9
        2 x 2 = 4 \t  3 x 2 = 6  ..... 9 x 2 = 18
        2 x 3 = 6 \t  3 x 3 = 9  ..... .....
        ...           ...
        2 x 9 = 18    3 x 9 = 27       9 x 9 = 81
         */
        for(int i=1; i<10; i++) {
            for(int dan = 2; dan < 10; dan++) {
                System.out.printf("%d x %d = %d\t", dan, i, (dan * i));
            }
            System.out.println();
        }
    }
}
