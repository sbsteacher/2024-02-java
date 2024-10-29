package com.green.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FinallyCase {
    public static void main(String[] args) {
        //만약 BufferedWriter writer = Files.newBufferedWriter(path); 이때는 문제가 없었고
        //writer.write("FinallyCase"); 이때 예외가 발생이 되었다면
        //writer.close(); 이 문장이 실행이 되지 않는다.
        //그런데 writer.close(); 이 문장이 무조건 실행이 되어야 한다.
        try {
            Path path = Paths.get("D:/Simple.txt"); //절대경로 (full 경로)
            BufferedWriter writer = Files.newBufferedWriter(path);
            writer.write("FinallyCase");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

class FinallyCase2 {
    /*
        writer.close(); 이 문장이 무조건 실행이 될 수 있도록 코드 작성
     */
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try {
            Path path = Paths.get("D:/Simple.txt"); //절대경로 (full 경로)
            writer = Files.newBufferedWriter(path);
            writer.write("FinallyCase");
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("이게 실행이 되나 안되나 ㅋㅋㅋ");
        try {
            if(writer != null) {
                writer.close();
            }
        } catch (IOException e) {

        }
        System.out.println("-- 끝 --");
    }
}

class FinallyCase3 {
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try {
            Path path = Paths.get("D:/Simple.txt"); //절대경로 (full 경로)
            writer = Files.newBufferedWriter(path);
            writer.write("FinallyCase");
            return;
        } catch (IOException e) {
            e.printStackTrace();
        } finally { //(실행보장)예외가 발생해도 안해도 무조건 실행되는 부분
            System.out.println("이게 실행이 되나 안되나 ㅋㅋㅋ (2)");
            try {
                if(writer != null) {
                    writer.close();
                }
            } catch (IOException e) {

            }
        }

        System.out.println("-- 끝 --");
    }
}











