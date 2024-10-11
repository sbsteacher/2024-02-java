package com.green.day04.ch05;

public class MissionForInFor5Result2 {
    public static void main(String[] args) {
        //int star = (int)(Math.random() * 6.0) + 3;
        int star = 3;

        for(int i=1; i<=star; i++) {
            for(int z=star; z>i; z--) {
                System.out.print("_");
            }
            for(int z=0; z<i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------");
        for(int i=star; i>0; i--) {
            for(int z=1; z<=star; z++) {
                System.out.print(z < i ? "_" : "*");
            }
            System.out.println();
        }
        /*

            star = 3
            __*
            _**
            ***

            star = 4
            ___*
            __**
            _***
            ****

            star = 5
            ____*
            ___**
            __***
            _****
            *****
         */
    }
}
