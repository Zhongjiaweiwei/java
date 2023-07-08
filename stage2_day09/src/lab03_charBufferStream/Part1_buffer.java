package lab03_charBufferStream;

import java.io.*;

/**
 * 字符缓冲流
 *
 */
public class Part1_buffer {
    public static void main(String[] args) throws IOException {
        /*
        BufferedWriter(Writer out) 创建字符缓冲输出流对象
        BufferedReader(Reader in) 创建字符缓冲输入流对象
        */
        BufferedWriter bw=new BufferedWriter(new FileWriter("stage2_day09\\src\\myFile\\a.txt"));
        bw.write("hello\r\n");
        bw.write("world\r\n");
        bw.close();
        BufferedReader br=new BufferedReader(new FileReader("stage2_day09\\src\\myFile\\a.txt"));
        //一次读取一个字节
        int ch;
        while ((ch=br.read())!=-1){
            System.out.print((char) ch);
        }
        br.close();
    }
}
