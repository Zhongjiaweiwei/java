package lab01_huanchong;

import java.io.*;

/**
 * 字节缓冲流定义
 */
public class Part1_define {
    public static void main(String[] args) throws IOException {
        String file="stage2_day09\\src\\myFile\\a.txt";
        //就是先将数据存入缓冲区，加快操作速度
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(file));
        bos.write("hello\r\n".getBytes());
        bos.write("world\r\n".getBytes());
        bos.close();
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
        byte[] bytes=new byte[1024];
        int len;
        while ((len=bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        bis.close();
    }
}
