package com.day20.Test003;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerTest {
    public static void main(String[] args) {
        byte[] b = new byte[1024];

        DatagramSocket ds = null;
        DatagramPacket dp = null;
        try {
            ds = new DatagramSocket(8888);
            dp = new DatagramPacket(b,1024);
            System.out.println("等待接受数据");
            ds.receive(dp);
            String str = new String(dp.getData(),0,dp.getLength())+"form"+dp.getAddress().getHostAddress()+":"+dp.getPort();

            System.out.println(str);



        } catch (SocketException e) {
            e.printStackTrace();
        }catch (IOException e){

        }finally {

            ds.close();
        }
    }
}
