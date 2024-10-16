package com.green.day07.ch10;

public class ClassVarAccess {
    public static void main(String[] args) {
        AccessWay aw = new AccessWay();
        aw.increaseCnt();
        aw.num++;
        AccessWay.num++;
        System.out.printf("num: %d\n", AccessWay.num); // 클래스명.static 변수 or 메소드, 이렇게 사용하는 것이 맞다.
        System.out.printf("num: %d\n", aw.num); //가능은 하나 static때문에 객체화를 하지 않기 때문에 쓸일이 없다.
    }
}

class AccessWay {
    static int num = 0;
    AccessWay() { increaseCnt(); }
    void increaseCnt() { num++; }
}
