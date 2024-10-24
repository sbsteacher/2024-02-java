package com.green.day13;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        System.out.println(list); //[0]
        list.add(20);
        System.out.println(list); //[0, 0]
    }
}
