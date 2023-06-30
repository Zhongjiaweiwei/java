package lab03_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 复制文件
 */
public class Part5_fuzhi {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("stage2_day08\\src\\lab03_io\\myFile\\1.txt");
        FileOutputStream fileOutputStream=new FileOutputStream("stage2_day08\\src\\lab03_io\\myFile\\2.txt",true);
        int by;
        fileOutputStream.write("\r\n".getBytes());
        while ((by=fileInputStream.read())!=-1){
            fileOutputStream.write((char)by);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
