package com.day13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Test0206 {
    public static void main(String[] args) {

    HashSet<Integer> hashSet =new HashSet<>();


        //用while循环,如果hashset的大小不大于10的话就继续循环
       while (hashSet.size()<10){
           //创建随机数
           Random random = new Random();
           //用int类型的数字去接受随机数,随机数范围限制到20
           int i =  random.nextInt(20);
           //将每次的随机数i加入到hashset中,因为set集合不能重复,所以大小没到10就继续循环加入
           hashSet.add(i);
       }

        Iterator<Integer> it = hashSet.iterator();
       while (it.hasNext()){
           int j =it.next();
           System.out.print (j+" ");


       }

    }
}
