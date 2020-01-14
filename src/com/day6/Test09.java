package com.day6;


import java.util.ArrayList;

public class Test09 {

    public static void main(String[] args) {

        ArrayList<Student1> arrayList = new ArrayList<>();
        arrayList.add(new Student1("狂刀三浪", 72.0));
        arrayList.add(new Student1("追月道友", 84.0));
        arrayList.add(new Student1("苏氏阿七", 79.0));
        arrayList.add(new Student1("白前辈", 96.0));
        arrayList.add(new Student1("宋书航", 94.0));
        arrayList.add(new Student1("啊十六", 87.0));

        //冒泡,arrayList.size()-1是因为集合从1开始算
        for (int i = 0; i < arrayList.size() - 1; i++) {
            // 减少冒泡排序的重复,所以在arrayList.size()再-i.
            for (int j = 0; j < arrayList.size() - 1 - i; j++) {
                //获取被比较的对象 相邻的两个  j ,j+1 比较后交换位置
                Student1 s1 = arrayList.get(j);
                Student1 s2 = arrayList.get(j + 1);

                if (s1.getScore() < s2.getScore()) {
                    //比较之后,大的在前,小的在后..
                    arrayList.set(j, s2);
                    arrayList.set(j + 1, s1);
                }

            }
        }

        int count = 3;
        for (int i = 0; i <= arrayList.size() - 1; i++) {
            //先通过遍历获取集合的每个元素
            Student1 student = arrayList.get(i);
            if (count > 0) {
                //定义一个show打印获取的student对象
                student.show();
            }
            //count放在if 外面就是为了每次只取一个student对象
            count--;
        }





        //冒泡
//        for (int i = 0; i < arrayList.size() - 1; i++) {
//
//            for (int j = 0; j < arrayList.size()-1-i; j++) {

//                if (arrayList.get(j).getScore() < arrayList.get(j+1).getScore()) {
        //采用集合的set方法修改比较的元素内容
//                    Student1 student = arrayList.get(j+1);
//                    arrayList.set(j+1, arrayList.get(j));
//                    arrayList.set(j, student);
//                }
//            }
//        }

        //之前通过冒泡将其集合元素从高往低排序.在通过定义count=3.用来得出前三项

    }
}
