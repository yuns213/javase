package com.day14;
import java.util.HashMap;

public class Test0210 {
    public static void main(String[] args) {

        String[] a={"河南省","浙江省","江西省","广东省","福建省"};

        String[] b={"郑州","杭州","南昌","广州","福州"};

        //创建一个hashmap集合,
        HashMap<String, String> map = new HashMap<>();
        //遍历
        for (int i = 0; i <a.length ; i++) {
            //获取字符串数组a的每一个元素
            String ka=a[i];

            //获取字符串数组b的每一个元素
            String kb=b[i];
            //把这个添加进hashmap中就组合了键值对
            map.put(ka,kb);
        }
        System.out.println(map);
    }
}
