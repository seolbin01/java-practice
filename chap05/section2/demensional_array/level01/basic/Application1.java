package com.seolbin.chap05.section2.demensional_array.level01.basic;

public class Application1 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];

        int num = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                 arr[i][j] = num;
                num++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
