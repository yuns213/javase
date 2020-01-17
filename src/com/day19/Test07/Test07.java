package com.day19.Test07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test07 {
    public static void main(String[] args) {

        Student st = new Student("王诗",21,"女");

        ObjectOutputStream oos = null;

        try {
            oos =new ObjectOutputStream(new FileOutputStream("D://cs//stu.txt"));

            oos.writeObject(st);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){

        }finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
