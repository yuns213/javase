package com.day3;

public class jiujiuchenfa {

    public static void main(String[] args) {

        //这个是用for循环做的九九乘法
//        for (int i = 0; i <10 ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(j+"*"+i+"="+i*j+" ");
//
//            }
//            System.out.println(" ");
//        }


        //这个是用while做的九九乘法
//        int i = 1;
//        int j = 1;
//        while (i < 10) {
//            //嵌套while..需要在里面的while上再加入初始化表达式,.不然不会进入这个while  .
//            j = 1;
//            while (j <i+1) {
//                System.out.print(j + "*" + i + "=" + i * j+" ");
//                j++;
//            }
//            System.out.println("");
//            i++;
//        }


        int i = 0;
        int j = 1;
        do {
            //顺序运行,所以为了防止首位有空格,把sout放在这个do的的最后
            i++;
            j = 1;
            do {
                System.out.print(j + "*" + i + "=" + i * j + " ");
                j++;
            } while (j < i + 1);
            System.out.println();
        } while (i < 9);
    }
}
