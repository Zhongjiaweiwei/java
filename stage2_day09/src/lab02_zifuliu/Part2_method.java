package lab02_zifuliu;

import sun.nio.cs.ext.GBK;

import java.io.*;

public class Part2_method {
    public static void main(String[] args) throws IOException {
        /*InputStreamReader(InputStream in)使用默认字符编码创建InputStreamReader对象
        InputStreamReader(InputStream in,String charset)使用指定的字符编码创建InputStreamReader对象
        OutputStreamWriter(OutputStream out)使用默认字符编码创建OutputStreamWriter对象
        OutputStreamWriter(OutputStream out,String charset)使用指定的字符编码创建OutputStreamWriter对象*/
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("stage2_day09\\src\\myFile\\a.txt"), "GBK");
        osw.write("钟佳炜");
        osw.close();
        InputStreamReader isr=new InputStreamReader(new FileInputStream("stage2_day09\\src\\myFile\\a.txt"),"GBK");
        int ch;
        while ((ch= isr.read())!=-1){
            System.out.print((char) ch);
        }
        isr.close();

    }
}
