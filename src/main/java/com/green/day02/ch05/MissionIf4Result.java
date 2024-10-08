package com.green.day02.ch05;

public class MissionIf4Result {
    public static void main(String[] args) {
        int score = (int)(Math.random() * 101.0); //0이상 100이하의 랜덤값 나올 수 있도록 세팅
        System.out.printf("score: %d\n", score);

        if(score == 100 || score >= 98) {
            System.out.println("A+");
        } else if(score >= 94) {
            System.out.println("A0");
        } else if(score >= 90) {
            System.out.println("A-");
        } else if(score >= 88) {
            System.out.println("B+");
        } else if(score >= 84) {
            System.out.println("B0");
        } else if(score >= 80) {
            System.out.println("B-");
        } else if(score >= 78) {
            System.out.println("C+");
        } else if(score >= 74) {
            System.out.println("C0");
        } else if(score >= 70) {
            System.out.println("C-");
        } else {
            System.out.println("D");
        }
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
