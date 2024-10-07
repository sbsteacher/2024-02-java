package com.green.day01.ch02;

public class StudyVariableNaming {
    public static void main(String[] args) {

        // <변수 명명규칙>
        // 1. 대소문자 구분, 길이 제한 없음
        int abc, abC; //둘은 다른 변수이다.

        // 2. 예약어를 사용하면 안 된다. 파란색 문자들
        // 예약어: 이미 기능의 약속이 되어 있는 단어(에디터에서 파란색으로 표시)
        //int class, void; //사용 불가

        // 3. 숫자로 시작 불가
        //int 1abc;

        // 4. 특수기호는 달러, 언더바 '$', '_' 가능, 나머지 불가
        int $abc, _abc;
        //int a#bc;

        // 5. Camel Case 기법을 사용, 변수명 사용 단어들 hello, my, name, is, hong
        int helloMyNameIsHong;

    }
}
