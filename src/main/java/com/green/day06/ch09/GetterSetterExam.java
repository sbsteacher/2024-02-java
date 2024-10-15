package com.green.day06.ch09;

public class GetterSetterExam {
    public static void main(String[] args) {
        Student s1 = new Student(); //s1객체
        s1.setName("홍길동");
        System.out.println(s1.getName());

        Student s2 = new Student(); //s2객체
        s2.setName("신사임당");

    }
}


class Student {
    private String name;
    private int age;
    private float height;

    //this는 나 자신의 주소값이 저장된 상수 (나 자신을 가리킨다)
    //name-setter
    public void setName(String name) {
        this.name = name;
    }

    //name-getter
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }


}
