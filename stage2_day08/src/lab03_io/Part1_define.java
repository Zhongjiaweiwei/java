package lab03_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Part1_define {
    /*字节流抽象基类
    InputStream：这个抽象类是表示字节输入流的所有类的超类
    OutputStream：这个抽象类是表示字节输出流的所有类的超类
    子类名特点：子类名称都是以其父类名作为子类名的后缀字节输出流
    FileOutputStream(String name)：创建文件输出流以指定的名称写入文件
    */
    public static void main(String[] args) throws IOException {
        FileOutputStream fo=new FileOutputStream("stage2_day08\\src\\lab03_io\\myFile\\java.txt");
        fo.write(97);//覆盖原有内容
        fo.close();
    }
}
