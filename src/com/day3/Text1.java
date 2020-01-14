package com.day3;

public class Text1 {

    public static void main(String[] args) {
        int sorce = 89;

        if (sorce >= 90 && sorce <= 100) {
            System.out.println("优秀");
        } else if (sorce >= 80 && sorce < 90) {
            System.out.println("好");
        } else if (sorce >= 70 && sorce < 80) {
            System.out.println("良");
        } else if (sorce >= 60 && sorce < 70) {
            System.out.println("及格");
        } else if (sorce < 60) {
            System.out.println("不及格");
        } else {
            System.out.println("成绩有误");
        }


    }
}
