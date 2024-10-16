package com.green.day07.ch10;

import java.io.PrintStream;

public class SystemOutPrintln {
    public static void main(String[] args) {
        System.out.println();

        PrintStream out = System.out;
        out.println();

        //System: 클래스
        //out: static final 멤버필드, PrintStream 객체의 주소값을 담을 수 있다.
        //println(): 메소드

        /*
        PrintStream은 println(int i), println(char c), println(String str) 등의
        메소드를 가지고 있고 이것은 오버로딩이다.
        만약 오버로딩이 없다면
        printlnInt(int i), printlnChar(char c), printlnString(String str)
        이런식으로 메소드를 만들어야만 한다.

         */
    }
}
