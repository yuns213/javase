package com.day20.Test009;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import java.net.ServerSocket;
import java.net.Socket;


public class Server extends Thread {

    private Socket socket;

    //创建一个带参数的构造方法
    public Server(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        //读取图片文件
        try (FileInputStream fis = new FileInputStream("d://cs//a.jpg");  //文件的输入流
             OutputStream os = socket.getOutputStream();    //网络输出流
        ) {
            //创建字节数组
            byte[] buf = new byte[1024 * 4];
            int len = 0;
            while ((len = fis.read(buf)) != -1) {
                os.write(buf, 0, len);
            }
            //关闭输出流
            socket.shutdownOutput();
            System.out.println(System.currentTimeMillis() + "  " + " 下载完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //启动程序
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis() + " 启动图片服务器");
        //创建一个ServerSocket对象
        try (ServerSocket serverSocket = new ServerSocket(9876);) {
            while (true) {
                //每次accpet()得到一个Socket对象以后，通过构造方法传入到多线程类中。
                Socket socket = serverSocket.accept();
                //输出连接的信息
                System.out.println(System.currentTimeMillis() + "  " + " 开始下载图片");
                //开启一个线程
                new Server(socket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
