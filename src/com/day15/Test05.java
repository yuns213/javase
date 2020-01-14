package com.day15;

import java.util.HashSet;


public class Test05 {
    public static void main(String[] args) {

        String[] str = {"絮絮", "海海", "梦梦", "七七", "憨憨", "三三", "月月", "可可", "雪雪", "妹妹"};


        //这是为了排除获取的重复的随机的int元素
        HashSet<Integer> set = new HashSet<>();

        boolean b = true;
        while (b) {
            //没有添加到10个元素就不会退出死循环
            if (set.size() >= 9) {
                b = false;
            }


            //Math的取值就是在0~0.9之间,乘10就可以在0~9取值.再通过强制转换成int类型,就能获取他的整型部分
            int i = (int) (Math.random() * 10);

            set.add(i);



        }
        //遍历这个set.将每个元素添加
        for (int s : set) {

            Thread t = new Thread(() -> {


                try {
                    Thread.sleep(5000);

                } catch (InterruptedException e) {
                    // TODO 自动生成的 catch 块
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName()
                        + " 过山洞");

            }, str[s]);

            t.start();

        }

    }


}
