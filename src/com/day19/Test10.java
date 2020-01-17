package com.day19;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test10 {
    public static void main(String[] args) {
        BufferedReader br = null;

        BufferedWriter bw = null;


        List<String> list = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader("D://cs//test.txt"));
            bw = new BufferedWriter(new FileWriter("D://cs//test1.txt"));
            String a=null;
            while ((a = br.readLine()) != null) {
                list.add(a);
            }
            Collections.reverse(list);
            for (String s : list) {

                bw.write(s);
                bw.newLine();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        } finally {
            try {
                bw.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


//        System.out.println(list);


    }
}
