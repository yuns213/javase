package com.day5;

public class Coder {
    private String name;
    private String id;
    private int salary;

    public Coder() {
    }

    public Coder(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void showSalary() {
        System.out.println("基本工资为" + salary + ",奖金无");
    }

    public void intro() {
        System.out.println("程序员姓名:" + name);
        System.out.println("工号:" + id);
    }

    public void work() {
        System.out.println("正在努力写代码....");
    }
}