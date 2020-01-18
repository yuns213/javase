package com.day20.Test003;

import java.io.IOException;
import java.net.*;

public class test03 {
    //    使用UDP协议实现一个程序(发送端)发送信息给另一个程序(接收端)，接收端将接收到的内容打印输出即可。

    public static void main(String[] args) {
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(3000);

            String str = "hello world ";

            DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), InetAddress.getByName("localhost"), 8888);
            ds.send(dp);


        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {

        } catch (IOException e) {

        } finally {

            ds.close();
        }
    }
}
