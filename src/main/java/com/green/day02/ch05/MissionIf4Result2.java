package com.green.day02.ch05;

public class MissionIf4Result2 {
    public static void main(String[] args) {
        int score = (int)(Math.random() * 101.0); //0이상 100이하의 랜덤값 나올 수 있도록 세팅
        System.out.printf("score: %d\n", score);

        char grade, opt = '0';

        if(score >= 90) {
            grade = 'A';
            if(score >= 98) {
                opt = '+';
            } else if(score < 94) {
                opt = '-';
            }
        } else if(score >= 80) {
            grade = 'B';
            if(score >= 88) {
                opt = '+';
            } else if(score < 84) {
                opt = '-';
            }
        } else if(score >= 70) {
            grade = 'C';
            if(score >= 78) {
                opt = '+';
            } else if(score < 74) {
                opt = '-';
            }
        } else {
            grade = 'D';
        }
        System.out.printf("%c%c\n", grade, opt);
        /*
            100점이면 A+
            98점이상이면 A+
            94이상 97이하 A0
            90이상 93이하 A-

            88점 이상 89이하 B+
            84점 이상 87이하 B0
            80점 이상 83이하 B-

            78점 이상 79이하 C+
            74점 이상 77이하 C0
            70점 이상 73이하 C-

            나머지 D
         */
    }
}
