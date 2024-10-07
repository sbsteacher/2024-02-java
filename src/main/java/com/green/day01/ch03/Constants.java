package com.green.day01.ch03;

public class Constants {
    public static void main(String[] args) {
        final int MAX_SIZE = 100;
        final char CONST_CHAR = '상';
        final int CONST_ASSIGNED;
        CONST_ASSIGNED = 12;

        System.out.printf("상수1: %d\n", MAX_SIZE);
        System.out.print("상수1: 100\n");

        System.out.printf("상수2: %c\n", CONST_CHAR);
        System.out.print("상수2: 상\n");

        System.out.printf("상수3: %d\n", CONST_ASSIGNED);
        System.out.print("상수3: 12\n");
    }
}
