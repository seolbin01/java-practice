package com.seolbin.chap03.level02.normal;

public class RandomMaker {

    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static String randomUpperAlphabet(int length){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<length;i++){
            char ch = (char)(int)(Math.random() * 26 + 65);
            sb.append(ch);
        }
        return sb.toString();
    }

    public static String rockPaperScissors(){
        int ranNum = (int) (Math.random() * 3);
        if(ranNum == 0){
            return "가위";
        }
        else if(ranNum == 1){
            return "바위";
        }
        else{
            return "보";
        }
    }

    public static String tossCoin(){
        int ranNum = (int) (Math.random() * 2);
        if(ranNum == 0){
            return "앞면";
        }
        else{
            return "뒷면";
        }
    }
}
