package com.seolbin.chap09.api.level01.basic;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Application1 {
    public static void main(String[] args) {

        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();

        StringTokenizer st = new StringTokenizer(str);

        StringBuilder sb = new StringBuilder();

        int count = 0;
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            char ch = token.charAt(0);   // 토큰의 가장 맨 앞 문자 변수에 저장
            sb.append(String.valueOf(ch).toUpperCase());   // toUpperCase() 메소드는 String 클래스의 메소드이므로 ch를 String으로 변환 후 toUpperCaser()
            sb.append(token.substring(1));   // 토큰 인덱스 1 이후의 문자들 sb에 append
            sb.append(" ");   // 공백 추가
            count++;   // 단어 개수 세기
        }

        System.out.println("변환된 문자열 : " + sb);
        System.out.println("총 단어 개수 : " + count);

    }
}
