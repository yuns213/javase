package com.day11.Test9.shop;

import java.util.Scanner;

public class Test09 {

    public static void main(String[] args) {
        System.out.println("           欢迎使用超市购物系统             ");
        Scanner in = new Scanner(System.in);

        System.out.println("请输入你要进行的操作:");
        System.out.println("1:购买商品    2:结算并打印小票   3:退出系统");
        String select = in.next();
        System.out.println("---------------------------");
        System.out.println("商品id      名称        单价      计价单位" );
        System.out.println("001         少林核桃     15.5        斤 ");
        System.out.println("002         尚康饼干     14.5        包 ");
        System.out.println("003         移动硬盘     345.0       个 ");
        System.out.println("004         高清无码     199.0       G ");
        System.out.println("---------------------------");

        String z ="^00[1234]-$";
        boolean b = true;
        while (b){

        }



    }

}
