package com.green.day16.ch26;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> supRandom = () -> (int)(Math.random() * 50.0); //0~49
        System.out.println(supRandom.get());

        List<Integer> list = makeIntList(supRandom, 5);
        System.out.println(list);
        //랜덤 정수값 (0~49) 5개를 가지고 있는 ArrayList를 리턴

        Supplier<Integer> supRandom2 = () -> (int)(Math.random() * 31.0) + 20;
        List<Integer> list2 = makeIntList(supRandom2, 8);
        System.out.println(list2);
        //랜덤 정수값(20~50) 8개를 가지고 있는 ArrayList를 리턴
    }

    static List<Integer> makeIntList(Supplier<Integer> sup, int len) {
        List<Integer> list = new ArrayList<>(len);
        for(int i=0; i<len; i++) {
            list.add(sup.get());
        }
        return list;
    }
}
