package lab03_io;

import java.io.FileOutputStream;
import java.io.IOException;

public class Part2_method {
    public static void main(String[] args) throws IOException {
        /*void write(int b) 将指定的字节写入此文件输出流 一次写一个字节数据
        void write(byte[] b) 将 b.length字节从指定的字节数组写入此文件输出流 一次写一个字节数组数据
        void write(byte[] b, int off, int len)将 len字节从指定的字节数组开始，
        从偏移量off开始写入此文件输出流一次写一个字节数组的部分数据*/
        FileOutputStream fo1=new FileOutputStream("stage2_day08\\src\\lab03_io\\myFile\\java.txt");
        fo1.write(97);//覆盖原有内容
        fo1.write(98);
        fo1.write(99);
        FileOutputStream fo2=new FileOutputStream("stage2_day08\\src\\lab03_io\\myFile\\xixi.txt");
        fo2.write('a');//覆盖原有内容
        FileOutputStream fo3=new FileOutputStream("stage2_day08\\src\\lab03_io\\myFile\\haha.txt");
        fo3.write(new byte[]{'a','b','c','d','e','f','g'},1,3);//覆盖原有内容
        fo1.close();
        fo2.close();
        fo3.close();
    }
}
