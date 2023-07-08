package lab02_zifuliu;

import java.io.*;

public class Part3_write {
    public static void main(String[] args) throws IOException {
        /*
        void write(int c) 写一个字符
        void write(char[] cbuf) 写入一个字符数组
        void write(char[] cbuf, int off, int len) 写入字符数组的一部分
        void write(String str) 写一个字符串
        void write(String str, int off, int len) 写一个字符串的一部分
        */
        /*
        flush() 刷新流，之后还可以继续写数据
        close() 关闭流，释放资源，但是在关闭之前会先刷新流。一旦关闭，就不能再写数据
        */
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("stage2_day09\\src\\myFile\\a.txt"), "GBK");
        osw.write(97);
        osw.write(new char[]{'a','b','c','d'});
        osw.write(new char[]{'e','f','g'},0,2);
        osw.write("gh");
        osw.flush();
        osw.write("ijkl",0,3);
        osw.close();
    }
}
