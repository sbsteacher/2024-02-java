package com.green.day16.ch26;

import java.util.function.Function;

public class FunctionDemoResult2 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[9000000];
        for(int i=0; i<arr.length; i++) {
            arr[i] = i;
        }


        //배열안에서 가장 큰 숫자 리턴
        Function<Integer[], Integer> fn = colls -> {

            int maxVal = colls[0];
            for(int i=1; i<colls.length; i++) {
                if(maxVal < colls[i]) {
                    maxVal = colls[i];
                }
            }
            return maxVal;
        };


        long beforeTime = System.currentTimeMillis();
        int maxValue = fn.apply(arr);

        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
        System.out.println("시간차이 : " + secDiffTime);
        System.out.println("maxValue: " + maxValue);
    }
}
