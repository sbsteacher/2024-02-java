package com.green.day11.ch16;

public class OverridingToString {
    public static void main(String[] args) {
        Cake c = new Cake();
        System.out.println(c);
        CheeseCake cheeseCake = new CheeseCake();
        System.out.println(cheeseCake);

        Cake c2 = cheeseCake;
        System.out.println(c2); //실행이 된다면 cheeseCake나 c2나 똑같다.


    }
}

class Cake extends Object {
    @Override //오버라이딩 실수 방지용, 오버라이딩이 아닐시 컴파일 에러
    public String toString() {
        return "My birthday cake";
    }

    final void blowCandle() { //final을 붙이면 오버라이딩 금지!
        System.out.println("초를 분다.");
    }
}

//class 앞에 final 키워드가 있으면 상속 금지
//대표적으로 String 클래스는 상속이 불가능
final class CheeseCake extends Cake {
    @Override
    public String toString() {
        return "My birthday cheese cake";
    }

    // 자식에서 blowCandle 오버라이딩을 할 수 없다.
    // 부모메소드에 final키워드가 있기 때문
//    void blowCandle() {
//        System.out.println("초를 분다.");
//    }
}

//상속을 받을 수 없다.
//class chocolateCheeseCake extends CheeseCake {
//
//}