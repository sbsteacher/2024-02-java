package com.green.day15.ch18;

public class ExceptionStudy {
    public static void main(String[] args) {
        String str1 = "123";
        int intVal1 = myParseInt(str1);
        System.out.println("intVal1: " + (intVal1 + 1));

        String str2 = "12a3";
        //문제가 발생이 되면 예외터트리지 않고 0을 리턴하는 메소드를 만들고 싶음.
        int intVal2 = myParseInt(str2);
        System.out.println("intVal2: " + intVal2);
    }

    public static int myParseInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            return 0;
        }
    }
    //1. myParseInt가 메소드인지는 (str1)을 보고 알았다.
    //2. myParseInt 앞에 .을 붙이지 않았기 때문에 같은 class안에 있는 메소드
    //3. 2번 내용과 일맥상통하게 .을 붙이지 않았다는 것은 객체화를 하지 않았다는 의미 고로 static 메소드
    //4. myParseInt(str1) 앞에 "int intVal1 =" 코드가 있었기 때문에 리턴 메소드
    //5. 리턴타입은 int라는 것을 알 수 있었다.
    //6. 파라미터는 str1의 타입이 String이기 때문에 파라미터 타입도 String

}
