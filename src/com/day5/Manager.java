package com.day5;

public class Manager {
    private String name;
    private String id;
    private int salary;
    private int bouns;

    public Manager() {
    }

    public Manager(String name, String id, int salary, int bouns) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bouns = bouns;
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

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBouns() {
        return bouns;
    }

    public void setBouns(int bouns) {
        this.bouns = bouns;
    }

    public void showSalary() {
        System.out.println("基本工资为" + salary + ",奖金为" + bouns);
    }

    public void intro() {
        System.out.println("经理姓名:" + name);
        System.out.println("工号:" + id);
    }

    public void work() {
        System.out.println("正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }
}