package com.seolbin.chap13.collection.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Application3 {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            Queue<String> waiting = new LinkedList<>();

            String name;
            while (true) {
                System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
                name = br.readLine();

                if(name.equals("next")) {
                    String client = waiting.poll();
                    if(client != null) {
                        System.out.println(client + " 고객님 차례입니다.");
                    } else System.out.println("대기 고객이 없습니다.");
                    continue;
                } else if(name.equals("exit")){
                    break;
                }

                waiting.offer(name);
                System.out.println(name + " 고객님 대기 등록 되었습니다.");

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
