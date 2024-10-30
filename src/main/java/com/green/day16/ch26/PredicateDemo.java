package com.green.day16.ch26;
//p.674
/*
    predicate: 서술어, 술부, 주어의 동작·상태·성질 따위를 서술하는 말

    Predicate 함수형 인터페이스, 인자가 하나, 타입은 제네릭(파라미터 하나) 리턴 boolean
 */

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> preMore10 = n -> n > 10;
        System.out.println(preMore10.test(9));
        System.out.println(preMore10.test(10));
        System.out.println(preMore10.test(11));

        System.out.println("----------------");
        //남자,남,여자,여 이러한 값들만 허용(true), 나머지 false
        Predicate<String> preCheckGender = s -> "남".equals(s)
                || "남자".equals(s)
                || "여".equals(s)
                || "여자".equals(s);

        boolean result = switch("남자") {
            case "남", "남자", "여", "여자" -> true;
            default -> false;
        };

        //소괄호, 중괄호, return 생략한 경우
        Predicate<String> preCheckGender2 = s -> switch(s) {
            case "남", "남자", "여", "여자" -> true;
            default -> false;
        };

        //생략없이 모두 작성한 경우
        Predicate<String> preCheckGender3 = (s) -> {
            return switch (s) {
                case "남", "남자", "여", "여자" -> true;
                default -> false;
            };
        };

        String gender = "여자";
        System.out.println(gender);
        if(preCheckGender.test(gender)) {
            System.out.println("성별을 잘 입력하셨습니다.");
        } else {
            System.out.println("성별을 확인해 주세요.");
        }

        System.out.println("----------------");

        examPredicate(preMore10, 9);
        examPredicate(n -> n > 10, 9);
        examPredicate(n -> n > 10, 11);

    }

    public static void examPredicate(Predicate<Integer> p, int n) {
        System.out.println(p.test(n));
    }
}
