package com.day14;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test0209 {

    public static void main(String[] args) {

        //创建map集合
        HashMap<String,Double> map  = new HashMap<>();
        //死循环,长度不到5不退出
        while (map.size()<5){
            //获取键盘输入的内容
            String in  = new Scanner(System.in).nextLine();
            //将内容通过split方法用","分割
            String[] arr  = in.split(",");
            //用字符串获取字符串数组的第一个字符串
            String s = arr[0];
            //将字符串数组第二个元素转换成double类型
           double d= Double.valueOf(arr[1]);
           //然后加入///.....map
            map.put(s,d);
        }

        map.remove("C++");

        map.put("Java",38.5);

        Set<String> set = map.keySet();

        for (String s:set){
            System.out.println(s+""+map.get(s));
        }

        Set<Map.Entry<String,Double>> set1 = map.entrySet();

        for (Map.Entry<String,Double> entry: set1){
            String key = entry.getKey();
            double value = entry.getValue();
            System.out.println("key:" + key + ",value:" + value);
        }


    }
}
