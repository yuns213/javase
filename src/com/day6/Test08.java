package com.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test08 {

    public static void main(String[] args) {

        ArrayList<Book> arrayList = new ArrayList<>();

        for (int i = 1; i < 4; i++) {

            System.out.println("请录入第" + i + "本书的名称:");
            Scanner input = new Scanner(System.in);
            //保存输入的数据
            String title = input.next();

            System.out.println("请录入第" + i + "本书的价格:");
            Scanner input2 = new Scanner(System.in);
            //保存输入的数据
            double price = input2.nextDouble();
            //把输入的数据保存到book类里
            Book book = new Book(title, price);
            //把book添加进集合里
            arrayList.add(book);


        }
        //打印所有的书
        for (int i = 0; i < 3; i++) {
            Book book = arrayList.get(i);

            System.out.println(book.getTitle() + "," + book.getPrice());
        }

        //定义一个最贵的书
        Book maxPrice = new Book("", 0);
        //通过比较把最贵的书赋值给maxPrice
        for (int i = 0; i < 3; i++) {

            Book book = arrayList.get(i);
            if (book.getPrice() > maxPrice.getPrice()) {
                maxPrice = book;
            }
        }
        System.out.println(maxPrice.getTitle() + "," + maxPrice.getPrice());


        //定义的是一个过度对象，工具人
//        ArrayList<Book> temp = new ArrayList<>();
//        Book t = new Book("",0);
//        temp.add(t);
//        temp.add(t);
//        temp.add(t);
//        for (int i = 0; i < arrayList.size(); i++) {
//            for (int j = 0; j < arrayList.size(); j++) {
//                temp.set(j,arrayList.get(i));
//                arrayList.set(i,arrayList.get(j));
//                temp.set(j,arrayList.get(i));
//            }
//        }


        System.out.println("------------------------------------------------");
        //遍历集合所有的元素,用冒泡排序做
        for (int i = 0; i < arrayList.size() - 1; i++) {

            for (int j = 0; j < arrayList.size() - 1 - i; j++) {
                //获取被比较的对象  0,1  1,2  2,3
                Book b1 = arrayList.get(j);
                Book b2 = arrayList.get(j + 1);
                //比较价格
                if (b1.getPrice() < b2.getPrice()) {
                    //交换位置
                    arrayList.set(j, b2);
                    arrayList.set(j + 1, b1);
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            Book book = arrayList.get(i);

            System.out.println(book.getTitle() + "," + book.getPrice());
        }

    }


//        for (int i = 0; i <3 ; i++) {
//            Book book = arrayList.get(i);
//            System.out.println(book.getTitle()+","+book.getPrice());
//        }
}

