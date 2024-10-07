package com.green.day01.ch01;

public class Ch01Mission02Result {
    public static void main(String[] args) {
        //아래 작성한 내용을 예상
        System.out.println("2 + 5 = " + 2 + 5);
        System.out.println("2 + 5 = 2" + 5);
        //"2 + 5 = " + 2 먼저 연산이 된다. 타입이 다르다
        //"2 + 5 = " + "2"
        //"2 + 5 = 2"
        System.out.println("2 + 5 = 25");
        //"2 + 5 = 2" + 5 두번째 연산이 된다. 타입이 다르다
        //"2 + 5 = 2" + "5"
        //"2 + 5 = 25"


        System.out.println("2 + 5 = " + (2 + 5));
        System.out.println("2 + 5 = " + 7);
        //(2 + 5) 연산의 우선순위가 더 높기 때문에 먼저 연산이 된다.
        //7
        System.out.println("2 + 5 = 7");
        //"2 + 5 = " + 7 두번째 연산이 된다. 타입이 다르다
        //"2 + 5 = " + "7"
        //"2 + 5 = 7"
    }
}
