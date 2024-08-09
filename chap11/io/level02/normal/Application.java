package com.seolbin.chap11.io.level02.normal;

import java.io.*;

public class Application {
    public static void main(String[] args) {

        String result = "";
        boolean chk = true;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("병합할 파일의 개수 입력 : ");
            int num = Integer.parseInt(br.readLine());

            String[] arr = new String[num];
            for (int i = 0; i < num; i++) {
                System.out.print((i + 1) + " 번째 파일 이름 입력 : ");
                arr[i] = br.readLine();
            }

            System.out.print("병합될 파일명 입력 : ");
            result = br.readLine();

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(result))) {

                for (int i = 0; i < num; i++) {
                    try (BufferedReader brFile = new BufferedReader(new FileReader(arr[i]))) {

                        String temp;
                        while ((temp = brFile.readLine()) != null) {
                            bw.write(temp);
                            bw.flush();
                        }

                    } catch (FileNotFoundException e) {
                        System.out.println("오류 : " + arr[i] + " (지정된 파일을 찾을 수 없습니다)");
                        chk = false;
                        break;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (chk) System.out.println("파일 병합이 완료 되었습니다.");
    }
}
