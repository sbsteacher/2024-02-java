package com.green.day05.ch06;

public class StackStudy {
    /*
        Stack: FILO (First In Last Out)
               가장 먼저 들어온 것이 가장 늦게 나간다.

               |   |
               |   |
               |___|
    iii
    KKK
    111
    !!!

     */
    public static void main(String[] args) {
        System.out.println("-- main [start] --");
        methodA();
        System.out.println("-- main [end] --");
    }

    static void methodA() {
        System.out.println("---- methodA [start] ----");
        methodB();
        System.out.println("---- methodA [end] ----");
    }

    static void methodB() {
        System.out.println("------ methodB [start] ------");
        System.out.println("------ methodB [end] ------");
    }
}
