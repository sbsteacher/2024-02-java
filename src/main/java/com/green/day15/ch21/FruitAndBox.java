package com.green.day15.ch21;
//p.480
//Generic이 없던 시절의 코드
public class FruitAndBox {
    public static void main(String[] args) {
        //사과상자 객체화 (이름은 자유)
        //오렌지상자 객체화
        AppleBox appleBox = new AppleBox(new Apple());
        OrangeBox orangeBox = new OrangeBox(new Orange());


    }
}
class Apple {
    public String toString() {
        return "사과";
    }
}

class Orange {
    public String toString() {
        return "오렌지";
    }
}

class AppleBox {
    private Apple ap;

    //private한 멤버필드에 값 넣는 방법 2가지
    //1.생성자
    //2.setter메소드

    //생성자 통해서 값 넣을 수 있게 해주세요.
    AppleBox(Apple ap) {
        this.ap = ap;
    }

    //메소드를 통해 ap값을 외부로 리턴할 수 있게 해주세요.

    Apple getAp() {
        return ap;
    }
}

class OrangeBox {
    private Orange orange;

    OrangeBox(Orange orange) {
        this.orange = orange;
    }

    public Orange getOrange() {
        return orange;
    }
}

