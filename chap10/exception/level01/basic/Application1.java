package com.seolbin.chap10.exception.level01.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("분자 입력 : ");
            int num1 = sc.nextInt();
            System.out.print("분모 입력 : ");
            int num2 = sc.nextInt();

            System.out.println("결과 : " + num1 / num2);

        } catch (InputMismatchException e) {
            System.out.println("오류 : 유효한 정수를 입력하세요.");
        } catch (ArithmeticException e){
            System.out.println("오류 : 0으로 나누는 것은 허용되지 않습니다.");
        } finally {
            System.out.println("실행이 완료되었습니다.");
        }

    }
}
