package com.day11.Test9;

import java.util.ArrayList;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {


        ArrayList<Goods> goods = new ArrayList<>();
        ArrayList<String> indentList = new ArrayList<>();
        goods.add(new Goods("001", "少林核桃", 15.5, "斤"));
        goods.add(new Goods("002", "尚康饼干", 14.5, "包"));
        goods.add(new Goods("003", "移动硬盘", 345.0, "个"));
        goods.add(new Goods("004", "高清无码", 199.0, "G"));
        boolean b = true;
         while (b) {

            System.out.println("请输入你要进行的操作：");
            System.out.println("1:购买商品         2:结算并打印小票         3:退出系统");
            Scanner in= new Scanner(System.in);
            String select  =in.next();
            switch (select){
                case "1":
                    //功能一
                    indentList = GoodsCommoDity.CommoDity(goods);
                    break;
                case "2":
                    //功能二
                    Settlement.Settlements(indentList,goods);
                    break;
                case "3":
                    //功能三
                    b = false;
                    System.out.println("感谢您使用超市购物系统,欢迎下次光临,拜拜");
                    break;
                default:
                    System.out.println("没有这个选择,请重选！！");
                    break;
            }
        }
    }
}
