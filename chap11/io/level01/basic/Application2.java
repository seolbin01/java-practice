package com.seolbin.chap11.io.level01.basic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원본 파일의 이름을 입력하세요 : ");
        String oriFile = sc.nextLine();
        System.out.print("복사 파일의 이름을 입력하세요 : ");
        String copyFile = sc.nextLine();

        FileReader fr = null;
        FileWriter fw = null;

        boolean chk = false;

        try {
            fr = new FileReader(oriFile);
            fw = new FileWriter(copyFile);

            int value;
            while ((value = fr.read()) != -1) {
                fw.write((char) value);
            }

            chk = true;

        } catch (FileNotFoundException e) {
            System.out.println("오류 : " + oriFile + " (지정된 파일을 찾을 수 없습니다)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        if(chk) System.out.println("파일 복사가 성공적으로 완료 되었습니다.");


    }
}
