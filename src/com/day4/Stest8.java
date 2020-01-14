package com.day4;

import java.util.StringTokenizer;

public class Stest8 {

    public static void main(String[] args) {

        String[]  ming = {"D","C","B","A","D"};
        String[]  hong = {"A","D","B","C","D"};
        String[]  huang = {"A","D","B","C","A"};
        String[]  qiang = {"A","B","C","D","D"};

        System.out.println("满分10分,小明:得分:"+pinF(ming)+"分");
        System.out.println("满分10分,小红:得分:"+pinF(hong)+"分");
        System.out.println("满分10分,小黄:得分:"+pinF(huang)+"分");
        System.out.println("满分10分,小强:得分:"+pinF(qiang)+"分");


    }

    public static int pinF(String[] test) {
        String[] asw = {"A","D","B","C","D"};
        int point = 0;
        for (int i = 0; i <asw.length ; i++) {
            if (test[i]==asw[i]){
                point +=2;
            }
        }return point;
    }
}
