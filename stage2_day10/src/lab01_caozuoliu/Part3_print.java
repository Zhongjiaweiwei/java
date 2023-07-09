package lab01_caozuoliu;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Part3_print {
    public static void main(String[] args) throws FileNotFoundException {
        /*打印流分类
        字节打印流：PrintStream
        字符打印流：PrintWriter

        打印流的特点
        只负责输出数据，不负责读取数据
        永远不会抛出IOException
        有自己的特有方法

        字节打印流
        PrintStream(String fileName)：使用指定的文件名创建新的打印流
        使用继承父类的方法写数据，查看的时候会转码；使用自己的特有方法写数据，查看的数据原样输出
        可以改变输出语句的目的地 public static void setOut(PrintStream out)：重新分配“标准”输出流*/
        PrintStream ps=new PrintStream("stage2_day10/src/myFile/a.txt");
        ps.println("hello");
        ps.println("world");
        ps.close();

        /*PrintWriter(String fileName) 使用指定的文件名创建一个新的PrintWriter，而不需要自动执行刷新
        PrintWriter(Writer out, boolean autoFlush)
        创建一个新的PrintWriter out：字符输出流 autoFlush： 一个布尔值，
        如果为真，则println ， printf ，或format方法将刷新输出缓冲区*/
        PrintWriter pw=new PrintWriter("stage2_day10/src/myFile/a.txt");
        pw.println("haha");
        pw.close();
    }
}
