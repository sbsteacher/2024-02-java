package com.green.day06.ch09;

public class UnsafeCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRad(1.5);
        System.out.println("원의 넓이(1): " + c.getArea());

        c.setRad(2.5);
        System.out.println("원의 넓이(2): " + c.getArea());

        c.setRad(-3.3);
        System.out.println("원의 넓이(3): " + c.getArea());

        c.rad = -3.3; //문제가 발생될 가능성이 있음.
        System.out.println("원의 넓이(4): " + c.getArea());
    }
}

class Circle {
    double rad = 0; //원의 반지름
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
