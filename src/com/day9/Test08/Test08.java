package com.day9.Test08;

public class Test08 {
    public static void main(String[] args) {

        GouWUChe gouWUChe = new GouWUChe();

        Laptop laptop = new Laptop("g10000","笔记本",10000);

        Phone phone  = new Phone("g10001","手机",5000);

        Fruit fruit = new Fruit("g10003","苹果",50);


        System.out.println("=========添加商品===========");
        gouWUChe.addGoods(laptop);
        gouWUChe.addGoods(phone);
        gouWUChe.addGoods(fruit);
        System.out.println("=========打印商品===========");
        gouWUChe.showGoods();
        System.out.println("---------------");
        gouWUChe.total();

    }
}
