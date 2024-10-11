package com.green.day03.ch05;

public class BreakBasic {
    public static void main(String[] args) {
        int n = 1;
        boolean search = false;

        while(n < 100) {
            System.out.println("n: " + n);
            if( ((n % 5) == 0) && ((n % 7) == 0) ) {
                search = true;
                break;
            }
            n++;
        }
        if(search) {
            System.out.printf("찾는 정수: %d\n", n);
        } else {
            System.out.println("못 찾음");
        }
    }
}
