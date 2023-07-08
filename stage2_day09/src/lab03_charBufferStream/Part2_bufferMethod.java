package lab03_charBufferStream;

import java.io.*;

/**
 * 缓冲流特有功能
 */
public class Part2_bufferMethod {
    public static void main(String[] args) throws IOException {
        /*
        void newLine() 写一行行分隔符，行分隔符字符串由系统属性定义
        String readLine()读一行文字。 结果包含行的内容的字符串，不包括任何行终止字符如果流的结尾已经到达，则为null
        */
        BufferedWriter bw = new BufferedWriter(new FileWriter("stage2_day09\\src\\myFile\\a.txt"));
        for (int i=1;i<=10;i++){
            bw.write("hello"+i);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("stage2_day09\\src\\myFile\\a.txt"));
        String line;
        while ((line= br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
