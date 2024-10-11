package com.green.day03.ch05;

public class MissionWhile3Result {
    public static void main(String[] args) {
        /*
        while문을 활용하여
        1000이하 자연수 중, 2의 배수이자 7의 배수인 수를 모두 출력하고,
        그 수들의 합을 구해서 출력하는 프로그램을 작성.
        합: 35784
        Source By 송은아
        */
        int n = 0;
        int sum = 0;
        while(n<=1000) {
            n++;
            if((n % 2) == 0 && (n % 7) == 0) {
                System.out.println(n);
                sum += n;
            }
        }
        System.out.println("result = " + sum);
    }
}
