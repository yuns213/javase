package com.day20.test03;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String[] args) {
        //线程池开启两个
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //开启服务器对象
        ServerSocket serverSocket = null;
        try {
            //开启端口
            serverSocket = new ServerSocket(8888);

            //开启了一个服务器端口
            while (true) {
                //这个放在死循环就是为了每次连上的客户端都是新的客户端
                Socket socket = serverSocket.accept();
                //用线程去做这个效率高一点
                Thread thread = new Thread() {
                    @Override
                    //重写run方法
                    public void run() {

                        //一个是读取客户端消息
                        InputStream is = null;

                        //给客户端发消息
//                        OutputStream os = null;

                        //收消息,服务器获取读取(字节流)
                        try {
                            //这个是获取客户端消息
                            is = socket.getInputStream();
                            //这个是长度
                            int len;
                            //这个byte数组
                            byte[] b = new byte[1024];
                            //
                            len = is.read(b);
                            String msg = new String(b, 0, len);
                            System.out.println("服务器收到消息" + msg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                };
                //线程池开启
                executorService.submit(thread);
                executorService.submit(thread);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}


