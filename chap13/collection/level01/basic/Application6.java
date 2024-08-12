package com.seolbin.chap13.collection.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Application6 {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            HashMap<String, String> phoneMap = new HashMap<>();

            String input;
            while (true) {
                System.out.print("단어 입력 ('exit' 입력 시 종료): ");
                input = br.readLine();

                if (input.equals("search")) {
                    System.out.print("검색 할 이름 : ");
                    String name = br.readLine();
                    String phone = phoneMap.get(name);
                    if (phone != null) {
                        System.out.println(name + "씨의 전화번호 : " + phone);
                    } else System.out.println(name + "씨의 번호는 등록 되어 있지 않습니다.");
                    continue;
                } else if (input.equals("exit")) break;

                String[] arr = input.split(" ");

                if (arr.length != 2) {
                    System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
                    continue;
                }

                phoneMap.put(arr[0], arr[1]);
                System.out.println("추가 완료 : " + input);

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
