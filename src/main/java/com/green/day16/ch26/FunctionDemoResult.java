package com.green.day16.ch26;

import java.util.function.Function;

public class FunctionDemoResult {
    public static void main(String[] args) {
        Integer[] arr = { 10, 20, 100, 30, 40, 200 };

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

        int maxValue = fn.apply(arr);
        System.out.println("maxValue: " + maxValue);
    }
}
