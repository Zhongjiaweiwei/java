package lab01_caozuoliu;

import java.io.PrintStream;

public class Part2_out {
    public static void main(String[] args) {
        /*PrintStream ps = System.out;
        PrintStream类有的方法，System.out都可以使用*/
        PrintStream ps=System.out;
        ps.println("hello");
        ps.println("world");
        //System.out的本质是一个字节输出流
        System.out.println("hello");
    }
}
