package com.day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test06 {
    public static void main(String[] args) {
        InputStreamReader isr = null;

        try {
            isr = new InputStreamReader(new FileInputStream("D://cs//a.txt"),"gbk");
            int i;

            while ((i=isr.read())!=-1){
                System.out.print((char)i);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){

        }finally {
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
