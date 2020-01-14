package com.day4;

public class Stest10 {

    public static void main(String[] args) {
        int[] pinot = {99, 100, 98, 97, 96};

        int max = max(pinot);
        int min = min(pinot);
        int sum = sum(pinot);
        int avg = (sum-max-min)/3;
        System.out.println("最终得分:"+avg);
    }

    public static int max(int[] pinot) {
        int max = 99;
        for (int i = 0; i < pinot.length; i++) {
            if (max > pinot[i]) {
                max = pinot[i];
            }
        }
        return max;
    }

    public static int min(int[] pinot) {
        int min = 99;
        for (int i = 0; i < pinot.length; i++) {
            if (min < pinot[i]) {
                min = pinot[i];
            }
        }
        return min;
    }

    public static int sum(int[] pinot) {
        int sum = 0;
        for (int i = 0; i <pinot.length ; i++) {
            sum+=pinot[i];

        }
        return sum;

    }

}
