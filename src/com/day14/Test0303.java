package com.day14;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Test0303 {

    public static void main(String[] args) {
        //这里的目的就是为了
        //获取随机数对象(6000是为了获取指定的一组随机数)
        Random r = new Random(6000);
        //创建一个长度为4的空字符串数组
        String[] str = new String[4];
        //创建一个能增删改查的字符串
        StringBuffer sb = new StringBuffer();
        //创建一个不能有重复数据的set集合
        HashSet<String> ls = new HashSet<>();
        //for循环遍历4次,得到四个商品编号
        for (int i = 0; i < 4; i++) {
            //清空字符串和set集合的元素,只是用来当工具,所以每次循环开始前都要清空
            sb.delete(0, sb.length());
            ls.clear();
            //当长度小8的时候就一直死循环
            while (ls.size() < 8) {
                //获取随机数
                int num = r.nextInt(10);
                //判断ls里如果没有这个元素就进入这个if.
                if (!ls.contains(num + "")) {
                    //添加这个元素,是为了不让ls重复出现同样的元素
                    ls.add(num + "");
                    //添加这个字符串,这个StringBuffer可以通过append在字符串末尾添加字符..
                    // 没有八个就不会跳出这个while死循环,最后转到str的时候就是八个元素的商品号
                    sb.append(num + "");
                }

            }
            //把sb转换成字符串存放在str字符串数组中.一共四个元素
            str[i] = sb.toString();
        }
        //创建一个hashmap集合  把四个商品放进去
        HashMap<String, String> map = new HashMap<>();
        map.put(str[0], "西瓜");// 53872106
        map.put(str[1], "苹果");// 47658392
        map.put(str[2], "橘子");// 93018742
        map.put(str[3], "香蕉");// 03718254
        System.out.println("请输入商品号：");
        //获取st这个录入的字符串
        String st = new Scanner(System.in).nextLine();
        //比较map的键集合中有没有输入的发这个商品号,从而执行下面的if判断
        if (map.keySet().contains(st)) {
            System.out.println("根据商品号：" + st + "，查询到对应的商品为：" + map.get(st));
        } else {
            System.out.println("查无此商品");
        }

    }

}
