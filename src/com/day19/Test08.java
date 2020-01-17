package com.day19;

import com.day19.Test07.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test08 {
    public static void main(String[] args) {
        //这个是反序列化ObjectinputStream
        ObjectInputStream ois =null;
        //这个是学生对象
        Student st = null;

        try {
            //这个是反序列话通过内部类调用fileinputstream这个输入字节流,并且调用文件路径
            ois= new ObjectInputStream(new FileInputStream("D://cs//stu.txt"));

                //这个是通过readobject这个方法 将读取到的数据 (现在读取的数据的类型是object类型)通过强制转换成student对象的类型就可以给st了
                st =(Student) ois.readObject();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){

        }finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        //因为student类的tostring没有重写,所以需要用这种方式来调用
        System.out.println(st.getName()+", "+st.getAge()+" ,"+st.getSex());
    }
}
