package com.day19;

import java.io.*;

public class Test03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        BufferedInputStream bis =null;
        FileOutputStream fos = null;
        BufferedOutputStream bos =null;
        try {
            fis = new FileInputStream("D://cs//a.jpg");
            bis  = new BufferedInputStream(fis);
            fos = new FileOutputStream("D://a.jpg");
            bos = new BufferedOutputStream(fos);

            byte[] b = new byte[1024];
            while (true){
                int a = bis.read(b);
                if (a==-1){
                    break;
                }
                bos.write(b,0,a);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){

        }finally {
            try {
                bos.close();
                fos.close();
                bis.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
