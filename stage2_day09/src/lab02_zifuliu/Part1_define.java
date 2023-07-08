package lab02_zifuliu;

import sun.nio.cs.ext.GBK;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 字符流=字节流+编码表
 */
public class Part1_define {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*
        byte[] getBytes() 使用平台的默认字符集将该 String编码为一系列字节
        byte[] getBytes(String charsetName) 使用指定的字符集将该 String编码为一系列字节
        String(byte[] bytes) 使用平台的默认字符集解码指定的字节数组来创建字符串
        String(byte[] bytes, String charsetName) 通过指定的字符集解码指定的字节数组来创建字符串
        */
        String s="钟佳炜";
        byte[] bytes=s.getBytes("GBK");
        System.out.println(Arrays.toString(bytes));

        byte[] bytes1=new byte[]{97,98,99,100};
        String s1 = new String(bytes1, "GBK");
        System.out.println(s1);
    }
}
