package com.seolbin.chap05.section01.array.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        int[] arr1 = new int[4];

        int num1 = 0;
        loop:
        while (num1 < 4) {
            arr1[num1] = (int) (Math.random() * 10);

            if (num1 != 0) {
                for (int i = 0; i < num1; i++) {
                    if (arr1[i] == arr1[num1]) {
                        continue loop;
                    }
                }
            }

            num1++;
        }

        Scanner sc = new Scanner(System.in);
        int num2 = 0;
        while(num2 < 10) {
            System.out.println((10 - num2) + "회 남으셨습니다.");
            System.out.print("4자리 숫자를 입력하세요 : ");
            String str = sc.nextLine();

            int[] arr2 = new int[4];
            if (str.length() == 4) {
                for (int j = 0; j < 4; j++) {
                    arr2[j] = str.charAt(j) - '0';
                }
            } else {
                System.out.println("4자리의 정수를 입력해야 합니다.");
                continue;
            }

            int scount = 0;
            int bcount = 0;
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (arr2[j] == arr1[k]) {
                        if (j == k) scount++;
                        else bcount++;
                    }
                }
            }

            if (scount == 4) {
                System.out.println("정답입니다.");
                return;
            }
            else System.out.println("아쉽네요 " + scount + "S " + bcount + "B 입니다.");

            num2++;
        }

        System.out.println("10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다.");
    }
}
