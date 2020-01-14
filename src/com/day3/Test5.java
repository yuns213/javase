package com.day3;

public class Test5 {

    public static void main(String[] args) {

        for (int i = 0; i < 15; i++) {
            //通过if和continue(跳过本次循环)把3的倍数跳出for循环里,在for里的i就不会打印出2的倍数
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
