package com.day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test0203 {
    public static void main(String[] args) {
     str('a');

    }

    public static void str(char c){
        FileInputStream fis =null;
        int s=0;
        try {
            fis = new FileInputStream("D://cs//test.txt");

            int a;

            while ((a=fis.read())!=-1){

                if (c == a){
                    s += 1;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){

        }
        System.out.println(c+"出现"+s+"次");
    }
}
