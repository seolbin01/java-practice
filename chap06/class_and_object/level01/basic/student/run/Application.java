package com.seolbin.chap06.class_and_object.level01.basic.student.run;

import com.seolbin.chap06.class_and_object.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO[] students = new StudentDTO[10];

        int count = 0;
        Scanner sc = new Scanner(System.in);
        label:
        while(count < 10) {
            System.out.print("학년 : ");
            int grade = sc.nextInt();
            System.out.print("반 : ");
            int classroom = sc.nextInt();
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("국어점수 : ");
            int kor = sc.nextInt();
            System.out.print("영어점수 : ");
            int eng = sc.nextInt();
            System.out.print("수학점수 : ");
            int math = sc.nextInt();

            students[count] = new StudentDTO(grade, classroom, name, kor, eng, math);

            count++;

            while(true) {
                System.out.print("계속 추가할 겁니까? (y/n) : ");
                char answer = sc.next().charAt(0);
                if (answer == 'y' || answer == 'Y') break;
                else if (answer == 'n' || answer == 'N') break label;
                else {
                    System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
                }
            }
        }

        for(int i = 0; i < count; i++) {
            System.out.println(students[i].getInformation());
        }

    }
}
