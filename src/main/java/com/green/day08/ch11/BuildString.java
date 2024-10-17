package com.green.day08.ch11;

//p.264 ~ 269
public class BuildString {
    public static void main(String[] args) {
        //문자열 "123"이 저장된 인스턴스 생성
        StringBuilder sb = new StringBuilder("123");
        sb.append(45678);

        System.out.println(sb);

        sb.delete(0, 2);
        System.out.println(sb);


        //미니 미션
        //모든 문자열을 지우는 방법 (치사하게 하지 말고)
        sb.delete(0, sb.length());
        //System.out.println(sb.lastIndexOf(""));
        //sb.delete(0, sb.lastIndexOf("")); //되기는 하나 length()메소드보다 불리하다.
        System.out.println("sb: " + sb);

        sb.append(345678);
        System.out.println("sb: " + sb);

        sb.replace(0, 3, "AB");
        String str = sb.toString(); //StringBuilder에서 String타입으로 변경 가능하다.

        System.out.println("sb: " + sb);
        System.out.println("str: " + str);

        StringBuilder sb2 = sb.reverse().replace(0, 2, "KK");
        sb.reverse();
        sb.replace(0, 2, "KK");
        //체이닝 기법, return this;가 핵심이다.

        System.out.println("sb: " + sb);
        System.out.println("sb == sb2: " + (sb == sb2));


    }
}


