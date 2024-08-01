package com.seolbin.chap04.section02.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 100) + 1;

        Scanner sc = new Scanner(System.in);

        int num;
        int times = 1;
        while (true) {
            System.out.print("정수를 입력하세요 : ");
            num = sc.nextInt();

            if (num < random) System.out.println("입력하신 정수보다 큽니다.");
            else if (num > random) System.out.println("입력하신 정수보다 작습니다.");
            else {
                System.out.println("정답입니다. " + times +"회만에 정답을 맞추셨습니다.");
                break;
            }
            times++;
        }

    }
}
