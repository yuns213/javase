package com.day14;

import java.util.HashMap;

public class Test0101 {
    public static void main(String[] args) {


        HashMap<Integer,String > map =new HashMap<>();

        map.put(1,"231");
        map.put(2,"231");
        map.put(3,"231");
        map.put(4,"231");
        map.put(5,"231");
        map.put(6,"231");
        map.put(7,"231");
        //用put修改
        map.put(1,"23131");
        //用get通过键获取value值
        System.out.println(map.get(1));
        //通过键删除值
        map.remove(1);

        System.out.println(map);


    }


}
