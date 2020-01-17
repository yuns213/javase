package com.day18;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class Test0204 {
    public static void main(String[] args) {
        Properties p = new Properties();

        File file = new File("D://cs//score.txt");


        FileInputStream fis = null;
//        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(file);
//            fos = new FileOutputStream(file);
            p.load(fis);
            Set<String> keys = p.stringPropertyNames();
            //获取到每一个key
            for (String key : keys) {
                //4:判断当前的key 是否为 "lisi"
                if ("lisi".equals(key)) {
                    //把"lisi"的值设置为100
                    p.setProperty(key, "100");
                }
            }


            Writer w = new FileWriter(file);
            p.store(w, null);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

        } finally {
            try {
//                fos.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
