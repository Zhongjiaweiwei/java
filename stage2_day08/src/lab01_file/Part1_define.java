package lab01_file;

import java.io.File;

public class Part1_define {
    public static void main(String[] args) {
        /*File(String pathname) 通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例
        File(String parent, String child) 从父路径名字符串和子路径名字符串创建新的 File实例
        File(File parent, String child) 从父抽象路径名和子路径名字符串创建新的 File实例*/
        File file1=new File("E:\\test\\test.txt");
        System.out.println(file1);
        File file2=new File("E:\\test","test.txt");
        System.out.println(file2);
        File file3=new File("E:\\test");
        File file4=new File(file3,"text.txt");
        System.out.println(file4);
    }
}
