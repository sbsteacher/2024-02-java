package com.green.day04.ch05;

public class Mission05_7_2Result {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                if((i * 10 + j) + (j * 10 + i) == 99)
                    System.out.println(i + ", " + j);
            }
        }
        /*
        다음 식을 만족하는 모든 A와 B의 조합을 구하는 프로그램을 작성하자.

        A  B
      + B  A
      -------
        9  9

         */
    }
}
