package com.seolbin.chap04.section02.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("받으신 금액을 입력하세요 : ");
        int money = sc.nextInt();
        System.out.print("상품 가격을 입력하세요 : ");
        int price = sc.nextInt();

        int change = money - price;
        int oriChange = change;

        System.out.println("============================");
        System.out.println("50000원권 지폐 " + change / 50000 + "장");
        change %= 50000;
        System.out.println("10000원권 지폐 " + change / 10000 + "장");
        change %= 10000;
        System.out.println("5000원권 지폐 " + change / 5000 + "장");
        change %= 5000;
        System.out.println("1000원권 지폐 " + change / 1000 + "장");
        change %= 1000;
        System.out.println("500원권 지폐 " + change / 500 + "장");
        change %= 500;
        System.out.println("100원권 지폐 " + change / 100 + "장");
        change %= 100;
        System.out.println("50원권 지폐 " + change / 50 + "장");
        change %= 50;
        System.out.println("10원권 지폐 " + change / 10 + "장");

        System.out.println("============================");
        System.out.println("거스름돈 : " + oriChange + "원");
    }
}
