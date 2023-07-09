package lab01_caozuoliu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Part1_in {
    public static void main(String[] args) throws IOException {
        /*
        System类中有两个静态的成员变量
        public static final InputStream in：标准输入流。通常该流对应于键盘输入或由主机环境或用户指定的另一个输入源
        public static final PrintStream out：标准输出流。通常该流对应于显示输出或由主机环境或用户指定的另一个输出目标
        */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符串");
        String s = br.readLine();
        System.out.println("您输入的字符串是:"+s);
        //自己实现键盘录入数据太麻烦了，所以Java就提供了一个类供我们使用
        Scanner sc = new Scanner(System.in);
    }
}
