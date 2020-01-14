package com.day9.Test07;

public class Company implements Money {

    private double gross = 1000000.0;

    @Override
    public void paySalary(Employee E) {
        //E.getPrice 指的获取员工类的的薪资
        gross = gross - E.getPrice();
        System.out.println("给"+E.getName()+"发工资 "+E.getPrice()+" 元,公司剩余: "+gross+" 元");


    }
}
