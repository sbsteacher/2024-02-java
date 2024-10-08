package com.green.day02.ch04;

public class ArithOp {
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 3;

        System.out.printf("%d + %d = %d\n", n1, n2, (n1 + n2));
        System.out.printf("%d - %d = %d\n", n1, n2, (n1 - n2));
        System.out.printf("%d * %d = %d\n", n1, n2, (n1 * n2));
        System.out.printf("%d / %d = %d\n", n1, n2, (n1 / n2));
        System.out.printf("%d %% %d = %d\n", n1, n2, (n1 % n2)); //mod

        /*
            %는 홀짝을 구할 때 사용할 수 있다.
            2로 나눴을 때 나머지값이 0이면 짝수, 1이면 홀수
            2로 나눴을 때 나머지값이 0이면 2의 배수이다.
            3로 나눴을 때 나머지값이 0이면 3의 배수이다.

            6 / 3 나머지가 0이 6은 3의 배수이다.
        */



    }
}
