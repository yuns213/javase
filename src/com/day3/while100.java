package com.day3;

public class while100 {
    public static void main(String[] args) {
        //计算0-100的数
        //sum指的是每次相加的数
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println(sum);

    }
}
