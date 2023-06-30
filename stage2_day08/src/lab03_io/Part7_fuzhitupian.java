package lab03_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 复制图片
 */
public class Part7_fuzhitupian {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("stage2_day08\\src\\lab03_io\\myFile\\target.png");
        FileOutputStream fileOutputStream=new FileOutputStream("stage2_day08\\src\\lab03_io\\myFile\\result.png");
        byte[] bytes=new byte[1024];
        int len;
        while ((len=fileInputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,len);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
