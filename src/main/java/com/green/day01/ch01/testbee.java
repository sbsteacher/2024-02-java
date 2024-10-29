package com.green.day01.ch01;

public class testbee {

    public static int Euclidean(int a, int b) {
        if (b == 0)
            return a;
        return Euclidean(b, a % b);
    }

    public static void main(String[] args) {

        System.out.print(Euclidean(1234,12345%1234));

    }
}
