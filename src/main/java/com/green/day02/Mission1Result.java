package com.green.day02;

public class Mission1Result {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 3;
        //n1 / n2 나누셔서 3.33333 나올 수 있도록 해주세요.

        System.out.println(n1 / n2);
        //int / int 결과타입도 int이기 때문에 실수값이 날아간다.

        float result = n1 / n2;
        System.out.println("result: " + result);
        //int / int 결과타입도 int이기 때문에 실수값이 날아간 3이 float에 저장된 것

        float result2 = (float)n1 / n2;
        System.out.println("result2: " + result2);
        // float / int >> float / float >> 결과타입도 float이다. 실수값도 살아있다.
    }
}
