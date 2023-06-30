package lab03_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 读数据
 */
public class Part4_dushuju {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("stage2_day08\\src\\lab03_io\\myFile\\xixi.txt");
        int by;
        while ((by=fis.read())!=-1){
            System.out.println((char) by);
        }
        fis.close();
    }
}
