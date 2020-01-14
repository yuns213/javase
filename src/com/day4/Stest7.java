package com.day4;

public class Stest7 {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        int[] arr1 = {1, 2, 3, 4, 3, 2, 1};

        boolean  jieguo= equals(arr,arr1);

        System.out.println("[1,2,3,4,3,2,1]");
        System.out.println("[1,2,3,4,3,2,1]");
        System.out.println("是否一致"+jieguo);
    }

    public static boolean equals(int[] arr, int[] arr1) {
        boolean b = true;
        if (arr.length!=arr1.length) {
            b=false;
        }
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]!=arr1[i]){
                    b = false;
                }
            }
        return b;

    }
}


