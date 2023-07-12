package lab01_InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Part1_define {
    //static InetAddress getByName(String host)确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
    //String getHostName() 获取此IP地址的主机名
    //String getHostAddress() 返回文本显示中的IP地址字符串
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress=InetAddress.getByName("192.168.42.223");
        String hostName = inetAddress.getHostName();
        String hostAddress = inetAddress.getHostAddress();
        System.out.println("主机名:"+hostName);
        System.out.println("ip地址:"+hostAddress);
    }
}
