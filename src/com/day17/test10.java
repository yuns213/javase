package com.day17;

public class test10 {
    public static void main(String[] args) {
        int num = 12;
        int sum = printDir(num);
        System.out.println(sum);


    }
    public static int printDir(int num){
        if (num == 1){
            return 1;
        }
        return num*printDir(num-1);
    }
}
