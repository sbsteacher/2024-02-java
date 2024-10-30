package com.green.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TryWithResource {
    public static void main(String[] args) {
        Path path = Paths.get("D:/Simple.txt"); //절대경로 (full 경로)
        try(BufferedWriter writer = Files.newBufferedWriter(path); Scanner scan = new Scanner(System.in)) {
            AutoCloseable auto =  writer;
            auto = scan;
            writer.write("FinallyCase");
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        writer.close();
        scan.close();
        무조건 실행이 된다.
        AutoCloseable 인터페이스를 상속받은 객체만 쓸 수 있다.
         */
        System.out.println("-- 끝 --");
    }
}
