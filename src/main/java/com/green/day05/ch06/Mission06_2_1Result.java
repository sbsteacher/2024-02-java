package com.green.day05.ch06;

public class Mission06_2_1Result {

    /*
    인자로 원의 반지름 정보를 전달하면, 원의 넓이를 계산하여 반환하는
    메소드와 원의 둘레를 계산하여 반환하는 메소드를 각각 정의하고,
    이 둘을 호출하는 main메소드를 정의하자.
     */
    public static void main(String[] args) {
        int radius = 10;
        System.out.println("둘레: " + getCircumference(radius));
        System.out.println("둘레: " + getCircumference(10.5));
        System.out.println("넓이: " + getArea(radius));
        System.out.println("넓이: " + getArea(10.5));
    }

    static double getCircumference(double radius) {//둘레
        return radius * 2 * 3.14;
    }

    static double getArea(double radius) { //넓이
       return radius * radius * 3.14;
    }

}
