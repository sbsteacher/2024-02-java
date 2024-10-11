package com.green.day03.ch05;

public class MissionContinueBreakResult2 {
    public static void main(String[] args) {
        /*
            자연수 1부터 시작해서 모든 홀수를 더해 나간다.
            그리고 그 합이 언제(몇을 더했을 때) 1,000을
            넘어서는지, 그리고 1,000을 넘어선 값은 얼마가
            되는지 계산하여 출력하는 프로그램을 작성해보자.

            마지막 더한값: 63
            1,000넘은 값: 1024
         */
        int i = 0;
        int odd = 0;
        while(true) {
            i++;
            if( (i % 2) == 1 ) { //i값을 2로 나눴을 때 나머지값이 1이면 >> 홀수
                //odd = odd + i;
                System.out.println("i: " + i);
                odd += i;
            }
            if(odd >= 1000) {
                break;
            }
        }
        System.out.printf("마지막 더한값: %d\n", i);
        System.out.println("odd: " + odd);

    }
}
