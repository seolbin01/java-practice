package com.seolbin.chap13.collection.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;

public class Application4 {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            HashSet<String> students = new HashSet<>();

            String studentID;
            while (true) {
                System.out.print("학생 ID 입력('exit' 입력 시 종료): ");
                studentID = br.readLine();

                if (studentID.equals("exit")) break;

                int pastSize = students.size();
                students.add(studentID);
                if(pastSize != students.size()) System.out.println("ID가 추가 되었습니다.");
                else System.out.println("이미 등록 된 ID입니다.");

            }

            StringBuilder sb = new StringBuilder();
            Iterator<String> iter = students.iterator();
            while (iter.hasNext()){
                sb.append(iter.next());
                if(iter.hasNext()) sb.append(", ");
            }

            System.out.println("모든 학생의 ID : [" + sb + "]");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
