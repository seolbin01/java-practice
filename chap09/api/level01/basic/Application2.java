package com.seolbin.chap09.api.level01.basic;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Application2 {
    public static void main(String[] args) {

        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : hello world Hello everyone! 안녕하세요 반갑습니다
         *
         * ----- 출력 예시 -----
         *
         * ===== 단어 빈도 =====
         * hello: 2
         * world: 1
         * everyone: 1
         * 가장 빈도 높은 단어 : hello (2 번)
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine().toLowerCase();

        StringTokenizer st = new StringTokenizer(str, "! ");
        String[] tokens = new String[st.countTokens()];
        int[] counts = new int[st.countTokens()];

        System.out.println(str);

        int index = 0;
        while(st.hasMoreTokens()) {
            tokens[index] = st.nextToken();
            index++;
        }

        for(String token : tokens) {
            System.out.println(token);
        }

        counts[0]++;
        for(int i=1;i<tokens.length;i++) {
            boolean chk = true;   // 등장했던 단어인지 check

            for(int j=0;j<i;j++){
                if(tokens[i].equals(tokens[j])) {
                    counts[j]++;   // 가장 먼저 등장했던 인덱스에서 count++
                    chk = false;   // 등장했던 단어면 false
                    break;
                }
            }

            if(chk){
                counts[i]++;   // 처음 등장한 단어면 해당 토큰과 같은 인덱스에서 count++
            }
        }

        int maxIdx = 0;   // 가장 빈도 높은 단어의 인덱스
        int maxCount = 0;   // 가장 빈도 높은 단어의 횟수
        for(int i=0;i<counts.length;i++) {
            if(counts[i] > 0) {
                if(counts[i] > maxCount) {
                    maxCount = counts[i];
                    maxIdx = i;
                }
                System.out.println(tokens[i] + ": " + counts[i]);
            }

        }

        System.out.println("가장 빈도 높은 단어 : " + tokens[maxIdx] + " (" + maxCount + " 번)");


    }
}
