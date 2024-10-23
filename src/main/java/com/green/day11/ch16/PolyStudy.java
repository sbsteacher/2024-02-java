package com.green.day11.ch16;
//다형성(polymorphism)
public class PolyStudy {
    /*
    다형성을 이해할 때 멤버필드도 이해해야하나 은닉화로 직접사용을 하지 않기 때문에
    멤버메소드 어떻게 동작하는지 이해하면 된다. 고로 아래 3가지만 기억하면 된다.
    1. 부모타입의 변수는 자식객체 주소값 저장할 수 있다.
    2. 1번의 반대는 안된다. 자식타입의 변수는 부모객체 주소값 저장할 수 없다.
    3. 타입은 호출할 수 있냐없냐(아는 메소드만 호출 가능, 모르는 메소드는 호출 불가)를 구분하고,
       호출이 된다면 객체 기준(우리가 원래 알던대로 동작).
       안다 모른다 구분은 해당 메소드를 가지고 있냐없냐로 구분 (상속 받은 메소드도 알고 있는 메소드)

    레퍼런스 변수끼리의 형변환이 가능한데 상속관계에서만 가능
    부모-자식 간에만 형변환이 가능하지 형제끼리는 안 된다.
     */
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.crying(); //야옹 야옹

        //Cat cat2 = new Dog(); //형제관계도 형변환 안된다.

        System.out.println("--------------------");
        //1번 검증
        Animal ani1 = new Cat();
        Animal ani2 = new Dog();
        Animal ani3 = new BullDog();
        Animal ani4 = new Bird();
        Dog dog1 = new BullDog();
        Animal ani5 = dog1;

        //2번 검증
        // BullDog bullDog1 = new Dog(); //불가 - 컴파일 에러 발생
        // BullDog bullDog2 = (BullDog)ani2;
        // ani2에는 Dog객체 주소값이 저장되어 있음.
        // 자식타입인 BullDog에 부모객체인 Dog객체 주소값을 담으려고 하니
        // 런타임 에러 발생


        //불독은 jump메소드를 알고있는데 Dog는 jump메소드 안 가지고 있기 때문에
        //호출이 만약에 된다면 에러가 터진다. 그래서 자바는 애초에 자식타입이
        //부모객체 주소값이 담기지 않도록 되어있다.
        //자식은 메소드가 부모보다 더 늘어날 수 있지만 줄어들 수는 없기 때문
        //강제로 저장하려고 하면 런타인 에러가 발생한다.
        /*
        BullDog b = new Dog();
        b.jump();
        */

        BullDog bullDog3 = (BullDog)dog1;
        //dog1에는 BullDog객체 주소값이 저장되어 있었기 때문에 문제없다.


        //3번 검증
        //ani3.jump(); //ani3에는 BullDog객체 주소값이 저장되어 있으나
        // Animal은 jump메소드를 모르기 때문에(존재하지않기 때문에) 호출할 수 없다.
        ((BullDog)ani3).jump();
        BullDog bullDog4 = (BullDog) ani3;
        System.out.println("ani3 == bullDog4 : " + (ani3 == bullDog4));
        bullDog4.jump();

        System.out.println("============");
        ani3.crying();
        bullDog4.crying();
        System.out.println("============");

        //instanceof: 형변환 가능여부, 가능 true, 불가능 false
        //왼쪽항 객체주소값 오른쪽항 타입(Class)
        //가능: 타입 기준에서 봤을 때 동일한 객체이거나 자식 객체
        //불가능: 가능의 반대

        ((BullDog)ani3).lay();
        ((Dog)ani3).lay();

        BullDog bullDog2 = new BullDog();
        Dog dog = (Dog)ani3;

        System.out.println(ani3 instanceof BullDog); //true
        System.out.println(ani3 instanceof Dog); //true
        System.out.println(ani4 instanceof BullDog); //false
        System.out.println(ani4 instanceof Bird); //true


        Cat cat2 = new Cat();
        Dog dog2 = new Dog();
        BullDog bullDog = new BullDog();
        Bird bird = new Bird();

        //동물을 울려주세요.
        //PolyStudy 아래에 있는 메소드
        //void
        //static
        //파라미터는 1개
        System.out.println(">>>>>>>>>>>>>>>>>>>>>");
        animalCrying(cat2); //야옹~ 야옹~
        animalCrying(dog2); //멍! 멍!
        animalCrying(bullDog); //월~ 월~, jump() 메소드 호출
        animalCrying(bird); //까악~ 까악~

        System.out.println("-- 끝 --");
    }

    static void animalCrying(Animal ani) {
        ani.crying();
        if(ani instanceof BullDog) {
            BullDog bullDog = (BullDog)ani;
            bullDog.jump();
        }
    }

}

class Animal {
    void crying() {
        System.out.println("동물이 운다~");
    }
}

class Cat extends Animal {
    @Override
    void crying() {
        System.out.println("야옹~ 야옹~");
    }
}

class Dog extends Animal {
    @Override
    void crying() {
        System.out.println("멍! 멍!");
    }

    void lay() {
        System.out.println("강아지가 눕는다.");
    }
}
class BullDog extends Dog {
    @Override
    void crying() {
        System.out.println("월~ 월~");
    }

    void jump() {
        System.out.println("불독이 점프점프");
    }
}
class Bird extends Animal {
    @Override
    void crying() {
        System.out.println("까악~ 까악~");
    }
}
