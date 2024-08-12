package com.seolbin.chap13.collection.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeSet;

public class Application5 {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            TreeSet<String> words = new TreeSet<>();

            String word;
            while (true) {
                System.out.print("단어 입력 ('exit' 입력 시 종료): ");
                word = br.readLine();

                if(word.equals("exit")) break;

                words.add(word);

            }

            StringBuilder sb = new StringBuilder();
            Iterator<String> iter = words.iterator();
            while (iter.hasNext()){
                sb.append(iter.next());
                if(iter.hasNext()) sb.append(", ");
            }

            System.out.println("정렬 된 단어 : [" + sb + "]");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
