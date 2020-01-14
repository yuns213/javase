package com.day4;

public class Stest6 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 3, 2, 1};

        boolean b = true;
        //突破思维限制,for里面可以存放多个int类型进行运算,定义一个start开始下标,一个end末尾下标
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            if (arr[start] != arr[end]) {
                b = false;
            }

        }
        System.out.println("[1,2,3,4,3,2,1]是否对称:" + b);
    }
}
