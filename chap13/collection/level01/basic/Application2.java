package com.seolbin.chap13.collection.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Application2 {
    public static void main(String[] args) {

        Stack<String> urlStack = new Stack<>();
        Stack<String> tempStack = new Stack<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String answer;
            while (true) {
                System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
                answer = br.readLine();

                if(answer.equals("exit")) break;

                urlStack.push(answer);

                StringBuilder sb = new StringBuilder();

                for(int i=0;i<5;i++) {
                    if(!urlStack.isEmpty()) {
                        String temp = urlStack.pop();
                        tempStack.add(temp);
                        sb.append(temp);
                        if(!urlStack.isEmpty() && i != 4) sb.append(", ");
                    } else break;
                }

                for(int i=0;i<5;i++) {
                    if(!tempStack.isEmpty()) {
                        String temp2 = tempStack.pop();
                        urlStack.add(temp2);
                    }
                }

                System.out.println("최근 방문 url : [" + sb + "]");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

