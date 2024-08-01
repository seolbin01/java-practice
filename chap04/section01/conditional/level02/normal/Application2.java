package com.seolbin.chap04.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("체중을 입력해주세요(kg) : ");
        double weight = sc.nextDouble();
        System.out.print("키를 입력해주세요(m) : ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);

        if(bmi < 20) System.out.println("당신은 저체중 입니다.");
        else if(bmi < 25) System.out.println("당신은 정상체중 입니다.");
        else if(bmi < 30) System.out.println("당신은 과체중 입니다.");
        else System.out.println("당신은 비만 입니다.");
    }
}
