package com.seolbin.chap04.section01.conditional.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("월 급여 입력 : ");
        int salary = sc.nextInt();
        System.out.print("매출액 입력 : ");
        int sales = sc.nextInt();
        int bonus = 0;

        if(sales >= 50000000) bonus = 5;
        else if(sales >= 30000000) bonus = 3;
        else if(sales >= 10000000) bonus = 1;

        int bonusPrice = (int) (sales * ((double) bonus / 100));

        System.out.println("======================");
        System.out.println("매출액 : " + sales);
        System.out.println("보너스율 : " + bonus + "%");
        System.out.println("월 급여 : " + salary);
        System.out.println("보너스 금액 : " + bonusPrice);
        System.out.println("======================");
        System.out.println("총 급여 : " + (salary + bonusPrice));

    }
}
