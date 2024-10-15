package com.green.day06.ch09;

public class InfoHideCircle {
    public static void main(String[] args) {
        Circle2 c = new Circle2();
        c.setRad(1.5);
        System.out.println("원의 넓이(1): " + c.getArea());

        //c.rad = -3.3; //rad 멤버필드에 접근이 되지 않는다.(읽기/쓰기 불가능)
        c.setRad(-3.3);
        System.out.println("원의 넓이(2): " + c.getArea());

        System.out.println(c.PI);
    }
}

class Circle2 {
    private double rad = 0;
    final double PI = 3.14;

    public void setRad(double r) { //음수값으로는 변경이 되지 않도록 한다.
        if(r < 0) {
            rad = 0;
            return;
        }
        rad = r;
    }

    public double getArea() { //원의 넓이값을 리턴
        return (rad * rad) * PI;
    }
}
