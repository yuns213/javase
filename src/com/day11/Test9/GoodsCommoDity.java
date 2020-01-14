package com.day11.Test9;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsCommoDity {
    public static ArrayList<String> CommoDity(ArrayList<Goods> goods) {
        System.out.println("--------------------------------------------------------");
        System.out.println("               商品列表");
        System.out.println("商品id     名称     单价    计价单位");
        for (int i = 0; i < goods.size(); i++) {
            System.out.print(goods.get(i).getId() + "\t\t");
            System.out.print(goods.get(i).getGoodsName() + "\t");
            System.out.print(goods.get(i).getPrice() + "\t");
            System.out.println(goods.get(i).getType() + "\t");
        }
        System.out.println("---------------------------------------------------------");
        ArrayList<String> indentList = new ArrayList<>();
        System.out.println("请输入您要购买的商品项(输入格式:商品id-购买数量),输入end表示购买结束。");
        while (true) {
            Scanner in= new Scanner(System.in);
            String selectGoods  =in.next();
            String[] goodsStr = selectGoods.split("-");
            if (goodsStr.length == 2) {
                int num = Integer.parseInt(goodsStr[0]);
                if (num < 1 || num >= 5) {
                    System.out.println("您输入的商品id不存在,请重新输入！！");
                    continue;
                }
                indentList.add(selectGoods);
            } else if ("end".equals(selectGoods)) {
                break;
            } else {
                System.out.println("您输入的购买姿势不对,请换个姿势再来一次(格式:商品id-购买数量)");
                continue;
            }
        }
        return indentList;
    }

//    public static void main(String[] args) {
//        ArrayList<Goods> goods = new ArrayList<>();
//        goods.add(new Goods("001", "少林核桃", 15.5, "斤"));
//        goods.add(new Goods("002", "尚康饼干", 14.5, "包"));
//        goods.add(new Goods("003", "移动硬盘", 345.0, "个"));
//        goods.add(new Goods("004", "高清无码", 199.0, "G"));
//
//        One(goods);
//    }
}
