package com.green.day10.ch13;

public class MissionTwoDimenArrayResult {
    public static void main(String[] args) {
        int[][] score = {
                //국어, 영어, 수학, 사회
                {100, 90, 80, 10}, //영수
                {90, 90, 80, 20}, //상철
                {80, 70, 60, 30}, //광수
                {90, 75, 66, 40}, //민우
        };
        String[] names = { "영수", "상철", "광수", "민우" };
        int[] namesScore = new int[names.length];

        String[] subjects = { "국어", "영어", "수학", "사회" };
        int[] subjectsScore = new int[subjects.length];

        //각 이름별, 과목별 합계값 구하는 부분
        int totalScore = 0;
        for(int i=0; i<score.length; i++) {
            for(int i2=0; i2<score[i].length; i2++) {
                totalScore += score[i][i2];
                namesScore[i] += score[i][i2]; //학생별 합계 점수 정리
                subjectsScore[i2] += score[i][i2]; //과목별 합계 점수 정리
            }
        }

        //학생 별 합계점수, 평균점수 출력하는 부분
        for(int i=0; i<names.length; i++) {
            System.out.printf("%s: 합계점수: %d, 평균점수: %.1f\n"
                    , names[i], namesScore[i], (float)namesScore[i] / subjects.length);
        }
        System.out.println("---------------------");
        //과목 별 합계점수, 평균점수
        for(int i=0; i<subjectsScore.length; i++) {
            System.out.printf("%s: 합계점수: %d, 평균점수: %.1f\n"
                    , subjects[i], subjectsScore[i], (float)subjectsScore[i] / names.length);
        }
        System.out.println("======================");
        System.out.printf("학급: 합계점수: %d, 평균점수: %.1f\n"
                , totalScore, (float)totalScore / (names.length * subjects.length));
        /*
        영수: 합계점수, 평균점수
        상철: 합계점수, 평균점수
        광수: 합계점수, 평균점수
        국어: 합계점수, 평균점수
        영어: 합계점수, 평균점수
        수학: 합계점수, 평균점수
        학급: 합계점수, 평균점수
         */


    }
}
