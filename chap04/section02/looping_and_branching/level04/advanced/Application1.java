package com.seolbin.chap04.section02.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();
        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();

        while (num > 26){
            num -= 26;
        }

        for(int i=0;i<str.length();i++){
            if(i % 2 != 0) continue;
            int chnum = str.charAt(i) + num;
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'
                    && chnum > 'Z') chnum -= 26;
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'
                    && chnum > 'z') chnum -= 26;

            char ch = (char) chnum;
            System.out.print(ch + " ");
        }
    }
}
