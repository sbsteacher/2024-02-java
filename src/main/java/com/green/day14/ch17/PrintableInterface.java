package com.green.day14.ch17;

/*
    인터페이스(Interface)의 용어적 설명: 이질적인 플랫폼간에 통신을 할 수 있는 역할을 해주는 것을 인터페이스라 부른다.
    사람이 컴퓨터를 다룰 때 키보드, 마우스 사용 (키보드, 마우스, 모니터 인터페이스라 부른다.)
    게임에서 화면에 나오는 버튼이랑 HP, MP 보이는 부분을 인터페이스라고 한다.

    자바의 인터페이스: 추상 메소드와 static 멤버필드만 가질 수 있는 존재,
                     인터페이스의 이름은 보통 형용사 (~~할 수 있는)


 */

public class PrintableInterface {
    public static void main(String[] args) {
       // Printable p1 = new Printable();
        Printable p2 = new PrintableImpl();
        p2.print("dddd");
        System.out.println(p2.NUM);
        System.out.println(Printable.NUM);
        //Printable.NUM = 10;
    }
}

//interface를 만들면 생략하면 무조건 들어가는 키워드가 있다.
/*
interface Printable {
    public static final int num = 0; //멤버필드 앞에는 public static final이 무조건 추가
    public abstract void print(String doc); //메소드 앞에는 public abstract가 무조건 추가
}

 */
interface Printable {
    int NUM = 10;
    void print(String doc);
}

class PrintableImpl implements Printable {

    @Override
    public void print(String doc) {
        System.out.println(NUM);
        System.out.println(doc);
    }
}

