package com.green.day05.ch06;

public class StackStudy {
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
        methodB();
        System.out.println("------ methodB [end] ------");
    }
}
