package com.seolbin.chap04.section01.conditional.level03.hard;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("과일 이름을 입력하세요 : ");
        String fruit = sc.nextLine();

        int price = 0;

        switch (fruit) {
            case "사과": price = 1000; break;
            case "바나나": price = 3000; break;
            case "복숭아": price = 2000; break;
            case "키위": price = 5000; break;
            default: break;
        }

        if (price == 0) System.out.println("준비된 상품이 없습니다.");
        else System.out.println(fruit + "의 가격은 " + price + "원 입니다.");
    }
}
