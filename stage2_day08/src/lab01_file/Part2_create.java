package lab01_file;

import java.io.File;
import java.io.IOException;

public class Part2_create {
    public static void main(String[] args) throws IOException {
        /*
        public boolean createNewFile() 当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
        public boolean mkdir() 创建由此抽象路径名命名的目录
        public boolean mkdirs() 创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录
        */
        File file1=new File("E:\\test\\test.txt");
        System.out.println(file1.createNewFile());

        File file2=new File("E:\\test\\old");
        System.out.println(file2.mkdir());

        File file3=new File("E:\\test\\new\\old");
        System.out.println(file3.mkdirs());
    }
}
