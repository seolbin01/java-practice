package com.seolbin.chap10.exception.level01.basic;

import com.seolbin.chap10.exception.level01.basic.exception.InvalidAgeException;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성): ");
            LocalDate date = LocalDate.parse(sc.nextLine());

            Exceptions exceptions = new Exceptions();

            exceptions.checkInvalidAge(date);

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (DateTimeParseException e) {
            System.out.println("날짜 양식을 잘못 입력하셨습니다.");
        }

    }
}
