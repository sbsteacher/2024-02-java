package com.green.day05.ch06;

public class Mission06_1_1Result {
    static void calc(int n1, int n2) {
        System.out.printf("%d + %d = %d\n", n1, n2, (n1 + n2));
        System.out.printf("%d - %d = %d\n", n1, n2, (n1 - n2));
        System.out.printf("%d / %d = %.3f\n", n1, n2, ((float)n1 / n2));
        System.out.printf("%d * %d = %d\n", n1, n2, (n1 * n2));
        System.out.printf("%d %% %d = %d\n", n1, n2, (n1 % n2));
    }

    public static void main(String[] args) {
        calc(10, 4);
        /*
        10 + 3 = 13
        10 - 3 = 7
        10 / 3 = 3.3333
        10 * 3 = 30
        10 % 3 = 1
         */
    }
}
