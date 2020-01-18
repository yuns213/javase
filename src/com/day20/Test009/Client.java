package com.day20.Test009;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        //创建客户端
        try(
                Socket socket = new Socket("192.168.151.88", 9876);
                //网络的输入流
                InputStream is = socket.getInputStream();
                //文件的输出流
                FileOutputStream fos = new FileOutputStream("e:/a.jpg");
        ) {
            byte[] buf = new byte[1024];
            int len = 0;
            //服务器端必须要shutdownOutput这里才能读取到-1
            while((len = is.read(buf))!=-1) {
                fos.write(buf,0,len);
            }
            System.out.println("图片下载成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
