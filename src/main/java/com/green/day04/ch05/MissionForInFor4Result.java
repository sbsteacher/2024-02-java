package com.green.day04.ch05;

public class MissionForInFor4Result {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 6.0) + 3;
        System.out.println("star: " + star);

        for(int i=0; i<star; i++) {    //i:1, i:2, i:3
            for(int z=0; z<=i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*

            star = 3
            *
            **
            ***

            star = 4
            *
            **
            ***
            ****

            star = 5
            *
            **
            ***
            ****
            *****
         */
    }
}
