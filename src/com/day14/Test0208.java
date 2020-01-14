package com.day14;

import org.jcp.xml.dsig.internal.SignerOutputStream;

import java.util.*;

public class Test0208 {

    public static void main(String[] args) {


        HashMap<String, Integer> map = new HashMap<>();

        Set<String> key = map.keySet();
        System.out.println("请输入姓名:");


        while (map.size() < 5) {
            String in = new Scanner(System.in).nextLine();
            Random random = new Random();

            int r = random.nextInt(100);

            map.put(in, r);

        }

        //迭代器只能使用一次,如果需要用两次需要再建立一个迭代器,不能重复使用
        Iterator<String> it = key.iterator();
        Iterator<String> it1 = key.iterator();



        int sum = 0;

        int max = 0;
        int min = 0;

        while (it.hasNext()) {
            String s = it.next();
            max = map.get(s);
            min = max;


        }


        while (it1.hasNext()) {
            String str = it1.next();
            sum += map.get(str);
            if (max < map.get(str)) {
                max = map.get(str);
            }
            if (min > map.get(str)) {
                min = map.get(str);
            }


        }

        int avg = sum/5;

        System.out.println("总分:" + sum);
        System.out.println("平均分:" + avg);
        System.out.println("最高分:" + max);
        System.out.println("最低分:" + min);
    }

}
