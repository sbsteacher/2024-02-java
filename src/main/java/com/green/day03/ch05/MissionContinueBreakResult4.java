package com.green.day03.ch05;

public class MissionContinueBreakResult4 {
    public static void main(String[] args) {
        /*
            자연수 1부터 시작해서 모든 홀수를 더해 나간다.
            그리고 그 합이 언제(몇을 더했을 때) 1,000을
            넘어서는지, 그리고 1,000을 넘어선 값은 얼마가
            되는지 계산하여 출력하는 프로그램을 작성해보자.

            마지막 더한값: 63
            1,000넘은 값: 1024
         */
        int lastIdx = 0;
        int odd = 0;
        for(int i = 1; odd < 1000; i+=2) {
            System.out.println("i: " + i);
            odd += i;
            lastIdx = i;
        }
        System.out.printf("마지막 더한값: %d\n", lastIdx);
        System.out.println("odd: " + odd);

    }
}
