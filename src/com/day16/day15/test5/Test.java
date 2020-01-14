package com.day16.day15.test5;

public class Test {

    public static void main(String[] args) {
        BaoZi baoZi = new BaoZi();
        baoZi.setNumber(6);

        Customer customer = new Customer(baoZi);
        Product product = new Product(baoZi);

        (new Thread(customer, "猪八戒")).start();
        (new Thread(product, "小二")).start();
    }
}
