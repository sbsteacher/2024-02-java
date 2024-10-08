package com.green.day02.ch05;

public class MissionIf4Result3 {
    public static void main(String[] args) {
        int score = (int)(Math.random() * 101.0); //0이상 100이하의 랜덤값 나올 수 있도록 세팅
        System.out.printf("score: %d\n", score);

        String grade = "D", opt = "";
        int gradeScore = score / 10;
        //100 / 10 >> 10
        //98 / 10 >> 9
        //82 / 10 >> 8
        //79 / 10 >> 7

        switch(gradeScore) {
            case 9, 10: grade = "A"; break;
            case 8: grade = "B"; break;
            case 7: grade = "C"; break;
        }
        int optScore = score % 10;
        //98 % 10  >>  8
        //88 % 10  >>  8
        //76 % 10  >>  6
        if(gradeScore > 6) {
            if(optScore >= 8 || score == 100) { opt = "+"; }
            else if(optScore >= 4) { opt = "0"; }
            else { opt = "-"; }
        }

        System.out.printf("%s%s", grade, opt);
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
