package com.day8.Test07;

public class Cook extends Employee{

    public Cook() {
    }

    public Cook(String empno, String name, double price) {
        super(empno, name, price);
    }



    @Override
    public void Work() {
        System.out.println("工号为:"+getEmpno()+",姓名为:"+getName()+",工资为:"+getPrice()+"的厨师在工作,炒菜");
    }

    @Override
    public void eat() {
        System.out.println("工号为:"+getEmpno()+",姓名为:"+getName()+",工资为:"+getPrice()+"的经理在吃肉");
    }
}
