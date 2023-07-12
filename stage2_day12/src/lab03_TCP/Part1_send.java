package lab03_TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Part1_send {
    /*
    Java中的TCP通信
    Java对基于TCP协议的的网络提供了良好的封装，使用Socket对象来代表两端的通信端口，并通过
    Socket产生IO流来进行网络通信。
    Java为客户端提供了Socket类，为服务器端提供了ServerSocket类

    Socket(InetAddress address,int port) 创建流套接字并将其连接到指定IP指定端口号
    Socket(String host, int port) 创建流套接字并将其连接到指定主机上的指定端口号

    InputStream getInputStream() 返回此套接字的输入流
    OutputStream getOutputStream() 返回此套接字的输出流
    */
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("192.168.42.223",54321);
        OutputStream os=socket.getOutputStream();
        os.write("hello,TCP".getBytes());
        socket.close();
    }
}
