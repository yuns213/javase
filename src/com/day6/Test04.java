package com.day6;

import java.util.ArrayList;

public class Test04 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();


        //add方法添加元素
        arrayList.add("孙悟空");
        arrayList.add("猪八戒");
        arrayList.add("沙和尚");
        arrayList.add("铁扇公主");

        System.out.println("获取索引为3的元素: "+arrayList.get(3));
        //set方法更改元素
        arrayList.set(3,"唐僧");

        arrayList.remove(1);

        for (int i = 0; i < arrayList.size(); i++) {
            //集合只能通过get 方法获取里面的元素
            System.out.println(arrayList.get(i));

        }

    }
}
