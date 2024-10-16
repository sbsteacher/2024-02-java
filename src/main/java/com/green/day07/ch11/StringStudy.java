package com.green.day07.ch11;

public class StringStudy {
    public static void main(String[] args) {
        String str1 = "Coffee";
        String str2 = "Bread";

        String str3 = str1.concat(str2);
        System.out.println(str3);

        String str4 = str1 + str2;
        System.out.println(str4);

        String str5 = str2.concat(str1);
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println(str5);

        System.out.println("----------------");
        String str6 = "abcdefghijklmn";
        System.out.println("str6.substring(3): "
                + str6.substring(3)); //파일명에서 확장자 추출할 때 사용

        System.out.println("str6.substring(4, 7): "
                + str6.substring(4, 7)); //4, 5, 6자리의 문자열을 리턴

        String fileNm = "nice_v.ery.Nice.jpg";
        System.out.println(".의 위치값: " + fileNm.indexOf("."));
        //왼쪽에서 오른쪽 방향으로 가장 빨리 찾은 index값을 리턴

        System.out.println("마지막 .의 위치값: " + fileNm.lastIndexOf("."));


        System.out.println("---------------------------");

        String str7 = "LExi";
        String str8 = "Lexi";

        System.out.println(str7.equals(str8));
        System.out.println(str7.compareTo(str8));
        System.out.println(str8.compareTo(str7));
        System.out.println(str7.compareTo("LExi")); //0이 나오면 같은 문자열이다.
        System.out.println(str7.equalsIgnoreCase(str8)); //대소문자 구분없이 같은지 비교, 영어만 의미가 있음

        System.out.println("-----------------------------");

        int n = 10;
        String str9 = n + "";
        String str10 = String.valueOf(n); //모든 타입을 String으로 변경할 수 있다.
    }


}
