package com.seolbin.chap04.section02.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("2보다 큰 정수를 하나 입력하세요 : ");
        int num = sc.nextInt();

        while (num <= 2) {
            System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
            System.out.print("2보다 큰 정수를 하나 입력하세요 : ");
            num = sc.nextInt();
        }

        boolean check = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                check = false;
                break;
            }
        }

        if (check) System.out.println("소수다.");
        else System.out.println("소수가 아니다.");
    }
}
