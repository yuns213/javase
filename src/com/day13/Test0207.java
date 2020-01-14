package com.day13;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test0207 {

    public static void main(String[] args) {
        System.out.println("请输入字符串:");
        Scanner in = new Scanner(System.in);


        String input = in.nextLine();
        //这个是有序的set集合
        LinkedHashSet<Character> set =new LinkedHashSet();

        char[] chars =input.toCharArray();

        for (char c :chars){
            set.add(c);

        }

        for (char c :set){
            System.out.print(c);

        }

    }
}
