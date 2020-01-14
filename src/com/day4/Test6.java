package com.day4;

public class Test6 {

    public static void main(String[] args) {

        printX(10);

    }

    public static void printX(int x) {
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= x; j++) {

                if (i == j || i + j == x) {
                    System.out.print("0");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println("");
        }
    }
}
