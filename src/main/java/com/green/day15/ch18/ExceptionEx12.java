package com.green.day15.ch18;
/*
자바의정석 p.429 있는 예제
 */

public class ExceptionEx12 {
    public static void main(String[] args)  {

        try {
            method1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-- 끝 --");
    }
    static void method1() throws Exception {
        method2();
    }
    static void method2() throws Exception {
        throw new Exception("하하");
        //throws 메소드에서만 사용할 수 있는게 아니고 예외를 일부로 발생시키고 싶을 때
    }
}
