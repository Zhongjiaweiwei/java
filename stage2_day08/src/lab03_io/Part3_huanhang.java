package lab03_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Part3_huanhang {
    public static void main(String[] args) throws IOException {
        /*
        字节流写数据如何实现换行
        windows:\r\n
        linux:\n
        mac:\r
        字节流写数据如何实现追加写入
        public FileOutputStream(String name,boolean append)
        创建文件输出流以指定的名称写入文件。如果第二个参数为true ，则字节将写入文件的末尾而不是开头
        */
        FileOutputStream fos=new FileOutputStream("stage2_day08\\src\\lab03_io\\myFile\\xixi.txt",true);
        fos.write("\r\n".getBytes());
        fos.write(new byte[]{'k','k','k'});
        fos.close();
    }
}
