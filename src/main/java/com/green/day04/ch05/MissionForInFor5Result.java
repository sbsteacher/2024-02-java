package com.green.day04.ch05;

public class MissionForInFor5Result {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 6.0) + 3;

        System.out.println(star);

         int i;
         int z;

         String sta="*";
         String line="_";


         for(i=0;i<star;i++){
             for(z=star-1;z>i;z--)
                 System.out.print(line);
             for(z=0;z<=i;z++){
                 System.out.print(sta);
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
