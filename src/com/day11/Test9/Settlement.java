package com.day11.Test9;

import java.util.ArrayList;

public class Settlement {
    public static void Settlements(ArrayList<String> indentList, ArrayList<Goods> goods) {

        int sumNum = 0;
        double price = 0;
        System.out.println("-----------------------------------------------");
        System.out.println("               欢迎光临");
        System.out.println("名称     售价     数量     金额");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < indentList.size(); i++) {
            String Id = indentList.get(i).substring(0, indentList.get(i).indexOf("-"));
            String s = indentList.get(i).substring(indentList.get(i).indexOf("-") + 1);
            int num = Integer.parseInt(s);
            for (int j = 0; j < goods.size(); j++) {
                if (Id.equals(goods.get(j).getId())) {
                    sumNum += num;
                    price = price + (goods.get(j).getPrice() * num);
                    System.out.print(goods.get(j).getGoodsName() + "\t");
                    System.out.print(goods.get(j).getPrice() + "\t");
                    System.out.print(num + "\t");
                    System.out.println(goods.get(j).getPrice() * num);
                }
            }
        }
        System.out.println("------------------------------------");
        System.out.println(indentList.size() + "项商品");
        System.out.println("共计：" + sumNum + "件");
        System.out.println("共计：" + price + "元");
        System.out.println("------------------------------------");
    }

//    public static void main(String[] args) {
//        Two();
//    }
//    Id[i] = Slist.get(i).substring(0, Slist.get(i).indexOf("-"));
//    String s = Slist.get(i).substring(Slist.get(i).indexOf("-"));
//    num[i] = Integer.parseInt(s);
}
