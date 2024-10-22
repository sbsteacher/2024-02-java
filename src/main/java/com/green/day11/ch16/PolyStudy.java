package com.green.day11.ch16;
//다형성(polymorphism)
public class PolyStudy {
    /*
    다형성을 이해할 때 멤버필드도 이해해야하나 은닉화로 직접사용을 하지 않기 때문에
    멤버메소드 어떻게 동작하는지 이해하면 된다. 고로 아래 3가지만 기억하면 된다.
    1. 부모타입의 변수는 자식객체 주소값 저장할 수 있다.
    2. 1번의 반대는 안된다. 자식타입의 변수는 부모객체 주소값 저장할 수 없다.
    3. 타입은 호출할 수 있냐없냐를 구분하고, 호출이 된다면 객체 기준.
     */
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.crying(); //고양이가 운다~
    }
}

class Animal {
    void crying() {
        System.out.println("동물이 운다~");
    }
}

class Cat extends Animal {

}

class Dog extends Animal {

}
class BullDog extends Dog {

}
class Bird extends Animal {

}
