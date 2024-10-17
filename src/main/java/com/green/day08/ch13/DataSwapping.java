package com.green.day08.ch13;

public class DataSwapping {
    public static void main(String[] args) {
        int n1 = 10, n2 = 20;
        int temp;

        temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.printf("n1: %d, n2: %d\n", n1, n2);
        //n1: 20, n2: 10
    }
}
