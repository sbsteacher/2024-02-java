package com.green.day05.ch06;

public class ReculFatorial {
    public static void main(String[] args) {
        //5!  >> 5 x 4 x 3 x 2 x 1
        //6!  >> 6 x 5 x 4 x 3 x 2 x 1
//        System.out.println(factorial(6));
//        System.out.println(factorial(5));
        System.out.println(factorial(4));
//        System.out.println(factorial(3));
//        System.out.println(factorial(2));
    }

    static int factorial(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
