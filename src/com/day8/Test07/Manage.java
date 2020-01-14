package com.day8.Test07;

public class Manage extends Employee{

    public Manage() {
    }

    public Manage(String empno, String name, double price) {
        super(empno, name, price);
    }

    @Override
    public void Work() {
        System.out.println("工号为:"+getEmpno()+",姓名为:"+getName()+",工资为:"+getPrice()+"的经理在工作,管理其他人");
    }

    @Override
    public void eat() {
        System.out.println("工号为:"+getEmpno()+",姓名为:"+getName()+",工资为:"+getPrice()+"的经理在吃鱼");
    }
}
