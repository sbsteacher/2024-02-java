package com.green.day03.ch05;

public class MissionContinueResult {
    public static void main(String[] args) {
        /* ContinueBasic의 존재하는 while문을 for문으로 변경해보자. */

        int count = 0;

        for (int n = 1; n < 100; n++) {
            if ( ((n % 5) == 0) && ((n % 7) == 0) ) {
                count++;
                System.out.println("n = " + n);
            }
        }
        System.out.println("count = " + count);

        int count2 = 0;
        for (int n = 1; n < 100; n++) {
            if ( ((n % 5) != 0) || ((n % 7) != 0) ) {
                continue;
            }
            count2++;
            System.out.println("n = " + n);
        }
        System.out.println("count2 = " + count2);



    }
}
