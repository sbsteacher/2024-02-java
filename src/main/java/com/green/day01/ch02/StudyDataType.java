package com.green.day01.ch02;

public class StudyDataType {
    public static void main(String[] args) {
        /*
            자료형: 정수형, 실수형, 불린형, 문자형 >> primitive type (기본 타입)

            특징: 타입이름이 소문자로 되어 있고, 총 8개, 기본 타입을 제외한 나머지는
                 reference type (참조 타입)이다.

            *타입명 옆에 (숫자)는 바이트(크기)를 의미한다.
            #정수형 (4가지): byte(1), short(2), int(4), long(8)
            #실수형 (2가지): float(4), double(8)
            #불린형: boolean(1)
            #문자형: char(2)

            자동형변환 방향: byte > short(char) > int > long > float > double
         */

        byte var1 = 127;
        short var2 = 300;
        int var3 = var1 + var2;

        int var4 = 100;
        long var5 = var4 + var4;

        //int var6 = var5; //반대방향은 자동형변환이 되지 않는다.
        int var6 = (int)var5; //강제형변환을 하여야 한다.
        float var7 = var5;
    }
}
