package com.day9.Test08;


import java.util.ArrayList;



public class GouWUChe {

    private ArrayList<Goods> arrayList = new ArrayList();

    public void addGoods(Goods goods) {
        arrayList.add(goods);
        System.out.println("加入 " + goods.getName() + " 成功");


    }

    public void showGoods() {
        System.out.println("您选购的商品为:");
        for (int i = 0; i < arrayList.size(); i++) {
            Goods goods = arrayList.get(i);
            System.out.println("    " + goods.getId() + "," + goods.getName() + "," + goods.getPrice());
        }
    }

    public void total() {
        //price 是原价
        double price = 0;
        //这个是电子商品打折的价格
        double price1 = 0;
        //这个是打折后的总价格
        double price2 = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            //遍历先把集合里的每个元素(伪数组)保存到goods商品数据里
            Goods goods = arrayList.get(i);
            //这行代码是先把原价计算出来
            price += goods.getPrice();
            //用if判断,,instanceof判断goods变量是不是存在于Egoods电子商品中,
            if (goods instanceof EGoods) {
                //是的话,打8.8折
                price1 = goods.getPrice() * 0.88;
                //并且把价格计算到折后价格里
                price2 += price1;
                //用continue跳出本次循环,避免重复计算,把这次的电子商品通过下面的代码以原价的方式加入到折后价格中.
                continue;
            }


            price2 += goods.getPrice();


        }

        System.out.println("原价为:" + price + " 元");
        System.out.println("折后价为:" + price2 + " 元");

    }
}
