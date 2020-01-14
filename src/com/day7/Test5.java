package com.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Test5 {

    public static void main(String[] args) {


        //定义一个装随机金额的集合
        ArrayList<Integer> arrayList = new ArrayList<>();

        //定义一个发的红包的总金额
        int money = 100;

        //定义一个计算金额的变量
        int count = 0;
        int num = 5;
        for (int i = 0; i < 4; i++) {

            Random r = new Random();


                count = r.nextInt(money / num) * 2 + 1;

            while (count >40||count<10) {

                count = r.nextInt(money / num) * 2 + 1;


            }
            arrayList.add(count);
            money -= count;

            num--;
        }

        arrayList.add(money);
        System.out.println(Arrays.toString(arrayList.toArray()));


    }
}
