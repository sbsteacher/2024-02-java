package com.green.day16.ch26;

public class Lambda1 {
    public static void main(String[] args) {
        //파라미터가 하나일 경우 () 소괄호 생략 가능
        PrintableVer2 p = s -> System.out.println(s);
        p.print("하하2");

        //중괄호 생략시 return도 생략 가능 (중괄호 생략시 return키워드 작성 불가)
        Calc sumCalc = (n1, n2) -> n1 + n2;
        System.out.println(sumCalc.calc(5, 8));
        System.out.println(sumCalc.calc(2, 3));

        Calc minusCalc = (n1, n2) -> { return n1 - n2; };
        System.out.println(minusCalc.calc(10, 7));
        System.out.println(minusCalc.calc(100, 13));
    }
}

@FunctionalInterface
interface PrintableVer2 {
    void print(String str);
}

@FunctionalInterface
interface Calc {
    int calc(int n1, int n2);
}