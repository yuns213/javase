package com.day7;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test09 {


    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        arrayList.add("bca");
        arrayList.add("dadfa");
        arrayList.add("dddaaa");
        arrayList.add("你好啊");
        arrayList.add("我来啦你干嘛呢");
        arrayList.add("别跑啊");
        //通过静态方法Array里的toString转化成字符串存放在String对象str中,然后就可以输出在控制台
        String str = arrayList.toString();

        System.out.println("源ArrayList:"+str);
        //通过遍历,获取集合每个元素
        for (int i = 0; i <arrayList.size() ; i++) {
            //通过强制转换把集合里的每个元素存放在set字符串对象里
            String set = (String) arrayList.get(i);
            //转换的set字符串可以获取他的长度,然后通过if把长度超过四的比较出来
            if(set.length()>=4){
                //然后长度超过4的元素用集合的remove方法删除掉
                arrayList.remove(i);
            }
        }
        //通过静态方法Array里的toString转化成字符串存放在String对象str1中,然后就可以输出在控制台
        String str1 = arrayList.toString();
        //这样就可以显示删除后的集合了
        System.out.println("删除后ArrayList:"+str1);

    }


}
