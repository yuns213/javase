package com.day8.Test07;

abstract class Employee {

    private String empno;
    private String name;
    private double price;

    public Employee() {
    }

    public Employee(String empno, String name, double price) {
        this.empno = empno;
        this.name = name;
        this.price = price;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public  abstract void Work();

    public  abstract  void eat();
}
