package com.seolbin.chap05.section2.demensional_array.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        while (true) {
            System.out.print("가로 행의 수를 입력하세요 : ");
            num1 = sc.nextInt();
            if(num1 >= 1 && num1 <= 10) {
                break;
            } else {
                System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
            }
        }

        while (true) {
            System.out.print("세로 행의 수를 입력하세요 : ");
            num2 = sc.nextInt();
            if(num2 >= 1 && num2 <= 10) {
                break;
            } else {
                System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
            }
        }

        char[][] arr = new char[num1][num2];

        for(int i=0;i<num1;i++) {
            for(int j=0;j<num2;j++) {
                char randomAlphabet = (char)((int)(Math.random() * 26) + 'A');
                arr[i][j] = randomAlphabet;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



    }
}
