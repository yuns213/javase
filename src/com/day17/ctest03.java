package com.day17;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ctest03 {

    public static void main(String[] args) {
        File file = new File("D://cs");

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        bianLi(file, map);

        Set<String> set = map.keySet();

        Iterator<String> itKey = set.iterator();

        while (itKey.hasNext()) {

            String key = itKey.next();

            Integer value = map.get(key);

            System.out.println(key + "类型的文件有： " + value + "个");
        }

        System.out.println("-----------------------------------");

        Set<Map.Entry<String, Integer>> entry = map.entrySet();

        Iterator<Map.Entry<String, Integer>> entryIt = entry.iterator();

        while (entryIt.hasNext()) {

            Map.Entry<String, Integer> entry1 = entryIt.next();

            System.out.println(entry1.getKey() + "类型的文件有： " + entry1.getValue() + "个");
        }
    }

    public static void bianLi(File file, HashMap<String, Integer> map) {
        File[] fileArr = file.listFiles();

        for (File f : fileArr) {

            if (f.isDirectory()) {

                bianLi(f, map);
            } else {

                int index = f.getName().lastIndexOf(".");

                String suffix = f.getName().substring(index + 1);

                if (map.containsKey(suffix)) {

                    map.put(suffix, map.get(suffix) + 1);

                } else {

                    map.put(suffix, 1);
                }
            }
        }
    }

}