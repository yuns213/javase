package com.day20.test04;


import javax.xml.transform.Source;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
//        Socket socket = null;
        InputStream is = null;
        OutputStream os = null;
        try {
            //连接服务器端口
           Socket socket = new Socket("localhost", 6666);
            while (true){
                //客户端发送消息
                String str = new Scanner(System.in).next();
                //用socket获取字节输出流
                os = socket.getOutputStream();
                //字节输出流用wirte发送到服务器
                os.write(str.getBytes());
                if ("end".equals(str)){
                    os.close();
                    socket.close();
                    return;
                }

                //收消息
                //用socket获取输入字节流
                is = socket.getInputStream();
                //定义一个数组
                byte[] b = new byte[1024*2];
                //定义每获取一个数组的长度
                int len =  is.read(b);

                if ("end".equals(new String(b,0,len))){
                    System.out.println("客户端收到消息,结束连接");
                    is.close();
                    socket.close();
                    return;
                }
                System.out.println("客户端收到消息: "+new String(b,0,len));

            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
