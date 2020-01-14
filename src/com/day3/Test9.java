package com.day3;

public class Test9 {
    public static void main(String[] args) {
        for (int i = 1; i <=7 ; i++) {

            for (int j = 1; j <=7; j++) {
                //根据图能看出,,每行的o相加等于8
                //i的值就是每行的第一个o
                //只有一
                if(i==j||i+j==8){
                    System.out.print("0");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println("");

        }
    }
}


