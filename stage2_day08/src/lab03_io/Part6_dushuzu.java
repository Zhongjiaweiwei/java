package lab03_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 一次读取一个数组数据
 */
public class Part6_dushuzu {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("stage2_day08\\src\\lab03_io\\myFile\\1.txt");
        byte[] bys=new byte[1024];
        int len;
        while ((len=fileInputStream.read(bys))!=-1){
            //此处是将byte数组转化为String,0为起始，len为长度
            System.out.println(new String(bys,0,len));
        }
        fileInputStream.close();
    }
}
