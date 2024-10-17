package com.green.day08.ch11;

import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {
        String email = "abc12@naver.com";
        String regExp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z0-9]{2,3}+$";
        String regExp2 = "^[a-zA-Z0-9+-_.]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]{2,}+$";

        boolean isOk = Pattern.matches(regExp, email);
        System.out.println(isOk);

        String REGEXP_KR = "^[가-힣]*$";
        isOk = Pattern.matches(REGEXP_KR, "안녕");
        System.out.println(isOk);
    }
}
