package com.seolbin.chap13.collection.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Application1 {
    public static void main(String[] args) {

        ArrayList<Integer> scoreList = new ArrayList<>();
        int count;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String answer;
            do {
                System.out.print("학생 성적 : ");
                scoreList.add(Integer.parseInt(br.readLine()));

                System.out.print("추가 입력하려면 y : ");
                answer = br.readLine();

            } while (answer.equals("y"));

            System.out.print("학생 인원 : ");
            count = Integer.parseInt(br.readLine());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int sum = 0;

        for(int score : scoreList) {
            sum += score;
        }

        double evg = (double)sum / count;

        System.out.println("평균 점수 : " + evg);

    }
}
