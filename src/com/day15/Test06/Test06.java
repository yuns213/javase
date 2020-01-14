package com.day15.Test06;

public class Test06 {
    public static void main(String[] args) {

    Sum sum = new Sum("水杯",100);

    Cup shiti = new Cup(sum);
    shiti.setName("实体店");

    Cup guanfang = new Cup(sum);
    guanfang.setName("官方");

    shiti.start();
    guanfang.start();

    }

}
