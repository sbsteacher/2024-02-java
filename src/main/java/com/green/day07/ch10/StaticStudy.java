package com.green.day07.ch10;

public class StaticStudy {
    public static void main(String[] args) {
        NonStaticNumBox nnb1 = new NonStaticNumBox();
        nnb1.n1 = 10;
        nnb1.n2 = 30;

        NonStaticNumBox nnb2 = new NonStaticNumBox();
        nnb2.n1 = 15;
        nnb2.n2 = 20;

        nnb1.sum(); //40
        nnb2.sum(); //35

        System.out.println("--------------");

        StaticNumBox snb1 = new StaticNumBox();
        snb1.n1 = 10;
        snb1.n2 = 30;

        StaticNumBox snb2 = new StaticNumBox();
        snb2.n1 = 15;
        snb2.n2 = 30;

        snb1.sum(); //45
        snb2.sum(); //45
        /*
        객체마다 멤버필드의 공간이 각각 생기길 원하면 non-static(인스턴스 멤버필드)
        로 해야한다. (각 객체마다 다른값을 저장 가능하게 하고 싶다면)

        static을 사용할 수 있으면 (위 두줄의 내용과 반대되는 경우) 적극 사용하는 걸 추천!
        왜냐면 일단 실행 속도가 빠르고 사용하기 편하다(객체 생성이 필요하지 않기 때문)

         */

        StaticNumBox.n1 = 50;
        StaticNumBox.n2 = 60;
        StaticNumBox.sum(); //110
        StaticNumBox.sum(150, 160); //310
        // 클래스 멤버필드, 메소드는 위 처럼 사용할 수 있다.
        // 매개변수만 이용하여 해결하는 메소드는 static method로 만들면 좋다.
        // (즉, 멤버필드 사용하지 않는 경우)

        Math.random(); //Math 클래스 안에 있는 random 이름의 static method
        //Math math = new Math();
        //math.random();
        // 이렇게 두 줄을 통해서 메소드를 호출할 필요가 없기 때문에 static 메소드가 사용이 편하다
        // 그리고 Math 클래스는 객체화를 할 수 없다.
        // 이유는 기본 생성자 접근레벨을 private으로 세팅했기 때문
    }
}
class StaticNumBox {
    static int n1;
    static int n2;
    int n3;
    int n4;

    static void sum(int n1, int n2) {
        System.out.println(n1 + n2);
    }
    // static int sum() { return 0; } //오버로딩은 파라미터만 다르다면 가능하다.

    static void sum() {
        System.out.println(n1 + n2);
        //System.out.println(n3 + n4); //static 메소드에서 인스턴스 멤버필드 접근 불가
        //hello(); //static메소드에서 인스턴스 메소드 호출 불가
    }

    void hello() {
        System.out.println("Hello");
    }
}

class NonStaticNumBox {
    int n1;
    int n2;
    static int n3;
    static int n4;

    void sum() {
        System.out.println(n1 + n2);
        System.out.println(n3 + n4); //인스턴스 메소드에서 클래스 멤버필드 접근 가능하다.
        hello(); //인스턴스 메소드에서 클래스 멤버메소드 호출 가능하다.
        // 왜 가능하냐 sum()메소드가 호출이 된다는 것은 NonStaticNumBox가 객체화가 되었다는
        // 것이고 static은 이미 메모리에 올라가 있기 때문에 사용이 가능하다.
    }

    static void hello() {
        System.out.println("Hello");
    }
}



