package com.day4;

public class Test8 {

    public static void main(String[] args) {

        System.out.println("摄氏度为:30.0°--华氏度为:"+ssd(30));
        System.out.println("华氏度为:86.0°--摄氏度为:"+hsd(86));


    }

    public static double hsd(double h) {
        double s = (h-32)/(9.0/5);
        return s;
    }
    public static double ssd(double s) {
            double h = (9.0/5)*s +32;
            return h;
    }
}
