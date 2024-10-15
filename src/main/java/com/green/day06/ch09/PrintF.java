package com.green.day06.ch09;

public class PrintF {
    public static void main(String[] args) {
        //상수 표현
        final int MAX_SIZE=100;

        final char CONST_CHAR='상';

        final int CONST_ASSIGNED;

        CONST_ASSIGNED=12;

        System.out.printf("상수 1: %d\n", MAX_SIZE + "\n"); //문제가 있음.
        System.out.printf("상수 1: %d\n", MAX_SIZE); //해결방법(1)
        System.out.printf("상수 1: %s", MAX_SIZE + "\n"); //해결방법(2)
        System.out.printf("상수 2: %c\n", CONST_CHAR);
        System.out.printf("상수 3: %d\n", CONST_ASSIGNED);
    }
}
