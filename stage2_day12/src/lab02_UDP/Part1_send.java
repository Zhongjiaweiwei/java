package lab02_UDP;

import java.io.IOException;
import java.net.*;

public class Part1_send {
    /*UDP协议是一种不可靠的网络协议，它在通信的两端各建立一个Socket对象，但是这两个Socket只是发
    送，接收数据的对象，因此对于基于UDP协议的通信双方而言，没有所谓的客户端和服务器的概念
    Java提供了DatagramSocket类作为基于UDP协议的Socket

    DatagramSocket()创建数据报套接字并将其绑定到本机地址上的任何可用端口
    DatagramPacket(byte[] buf,int len,InetAddress add,int port)创建数据包,
    发送长度为len的数据包到指定主机的指定端口

    void send(DatagramPacket p) 发送数据报包
    void close() 关闭数据报套接字
    void receive(DatagramPacket p) 从此套接字接受数据报包

    发送数据的步骤
    创建发送端的Socket对象(DatagramSocket)
    创建数据，并把数据打包
    调用DatagramSocket对象的方法发送数据
    关闭发送端
    */
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket();
        byte[] bytes="hello,UDP".getBytes();
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length, InetAddress.getByName("192.168.42.223"),12345);
        ds.send(dp);
        ds.close();
    }
}
