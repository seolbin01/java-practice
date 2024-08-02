package com.seolbin.chap05.section01.array.level04.advanced;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        int[] arr = new int[6];

        int num = 0;
        loop:
        while (num < 6) {
            arr[num] = (int) (Math.random() * 45) + 1;

            if (num != 0) {
                for (int i = 0; i < num; i++) {
                    if (arr[i] == arr[num]) {
                        continue loop;
                    }
                }
            }

            num++;
        }


        Arrays.sort(arr);

        for (
                int i = 0;
                i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
