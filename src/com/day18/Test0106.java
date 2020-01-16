package com.day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test0106 {
    public static void main(String[] args) {
        FileInputStream fis =null;
        FileOutputStream fos =null;
        try {
             fis = new FileInputStream("D://cs//a.jpg");
             fos = new FileOutputStream("D://a.jpg");

            int a ;
            while ((a=fis.read())!=-1){
                fos.write(a);
//                System.out.println(new String(b,0,a));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){

        }finally {
            try {
                fos.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
