package com.day5;

public class Circle {
    private  int r =1;

    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void showArea(){
        double area = r*r*3.14;
        System.out.println("半径为:"+r+",面积为:"+area);
    }
    public void showPerimeter(){
        double perimeter = r*2*3.14;
        System.out.println("半径为:"+r+",周长为:"+perimeter);
    }

}
