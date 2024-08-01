package com.seolbin.chap04.section01.conditional.level04.advanced;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수를 입력하세요 : ");
        int score1 = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        int score2 = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        int score3 = sc.nextInt();

        double avg = (double) (score1 + score2 + score3) / 3;

        if(avg >= 60){
            if(score1 >= 40 | score2 >= 40 | score3 >= 40){
                System.out.println("합격입니다!");
            }
        } else System.out.println("평균 점수 미달로 불합격입니다.");

        if(score1 < 40) System.out.println("국어 점수 미달로 불합격입니다.");
        if(score2 < 40) System.out.println("영어 점수 미달로 불합격입니다.");
        if(score3 < 40) System.out.println("수학 점수 미달로 불합격입니다.");

    }
}
