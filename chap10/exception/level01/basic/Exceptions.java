package com.seolbin.chap10.exception.level01.basic;

import com.seolbin.chap10.exception.level01.basic.exception.InvalidAgeException;

import java.time.LocalDate;

public class Exceptions {

    public void checkInvalidAge(LocalDate date) throws InvalidAgeException {
        LocalDate localDate = LocalDate.now();

        if (localDate.getYear() - date.getYear() < 19) {
            throw new InvalidAgeException("만 20세 미만은 입장 불가입니다.");
        }

        if (localDate.getYear() - date.getYear() == 19 &&
                localDate.getMonthValue() - date.getMonthValue() < 0) {
            throw new InvalidAgeException("만 20세 미만은 입장 불가입니다.");
        }

        if (localDate.getYear() - date.getYear() == 19 &&
                localDate.getMonthValue() - date.getMonthValue() == 0 &&
                localDate.getDayOfMonth() - date.getDayOfMonth() < 0) {
            throw new InvalidAgeException("만 20세 미만은 입장 불가입니다.");
        }


        System.out.println("입장하셔도 됩니다.");

    }
}
