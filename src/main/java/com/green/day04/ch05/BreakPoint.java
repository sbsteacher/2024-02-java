package com.green.day04.ch05;
//p.134
public class BreakPoint {
    public static void main(String[] args) {
        //구구단에서 곱의 결과가 72인 결과를 딱 하나만 보여라.
        for(int i=1; i<10; i++) {
            for(int z=1; z<10; z++) {
                if( (i * z) == 72 )  {
                    System.out.printf("%d x %d = %d\n", i, z, (i * z));
                    break;
                }
            }
        }
        System.out.println("--끝--");
    }
}
