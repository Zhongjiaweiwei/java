package lab01_file;

import java.io.File;
import java.io.IOException;

public class Part3_get {
    public static void main(String[] args) throws IOException {
        /*
        判断功能
        public boolean isDirectory() 测试此抽象路径名表示的File是否为目录
        public boolean isFile() 测试此抽象路径名表示的File是否为文件
        public boolean exists() 测试此抽象路径名表示的File是否存在
        */
        /*
        获取功能
        public String getAbsolutePath() 返回此抽象路径名的绝对路径名字符串
        public String getPath() 将此抽象路径名转换为路径名字符串
        public String getName() 返回由此抽象路径名表示的文件或目录的名称
        public String[] list() 返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
        public File[] listFiles() 返回此抽象路径名表示的目录中的文件和目录的File对象数组*/
        /*
        删除功能
        public boolean delete() 删除由此抽象路径名表示的文件或目录
        */

        File file1=new File("E:\\test\\test.txt");
        System.out.println(file1.isDirectory());//false
        System.out.println(file1.isFile());//true
        System.out.println(file1.exists());//true

        System.out.println("---------------");

        File file2=new File("E:\\test\\old");
        System.out.println(file2.isDirectory());//true
        System.out.println(file2.isFile());//false
        System.out.println(file2.exists());//true

        System.out.println("---------------");

        File file3=new File("stage2_day08\\src\\lab01_file\\myFile\\java.txt");
        System.out.println(file3.isDirectory());//false
        System.out.println(file3.isFile());//true
        System.out.println(file3.exists());//true

        System.out.println("---------------");

        System.out.println(file3.getAbsoluteFile());
        System.out.println(file3.getPath());
        System.out.println(file3.getName());

        System.out.println("---------------");

        File file4=new File("stage2_day08\\src\\lab01_file\\myFile");
        String[] list = file4.list();//文件+目录
        for (String s:list){
            System.out.println(s);
        }

        System.out.println("---------------");

        File[] files = file4.listFiles();//文件
        for (File file:files){
            System.out.println(file.getName());
        }

        System.out.println("---------------");

        File file5=new File("stage2_day08\\src\\lab01_file\\myFile\\hh.txt");
        System.out.println(file5.delete());
    }
}
