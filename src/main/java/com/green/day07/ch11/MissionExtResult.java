package com.green.day07.ch11;

public class MissionExtResult {
    public static void main(String[] args) {
        //점의 위치값으로 리터럴 사용 금지
        //fileNm에서 jpg문자열을 뽑아내주세요.
        String fileNm = "nice_v.ery.Nice.jpg";

        String ext = fileNm.substring(fileNm.lastIndexOf(".") + 1);

        System.out.println(ext); //jpg
    }
}
