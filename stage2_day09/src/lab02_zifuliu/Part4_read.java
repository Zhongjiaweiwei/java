package lab02_zifuliu;

import java.io.*;

public class Part4_read {
    public static void main(String[] args) throws IOException {
        /*
        int read() 一次读一个字符数据
        int read(char[] chars) 一次读一个字符数组数据
        */
        InputStreamReader isr = new InputStreamReader(new FileInputStream("stage2_day09\\src\\myFile\\a.txt"), "GBK");
        readOneChar(isr);
        System.out.println();
        System.out.println("---------------------");
        //下面的读不出来，我觉得是指针的问题，read指针指到最后一个字符
        readCharList(isr);
        isr.close();
    }

    public static void readOneChar(InputStreamReader isr) throws IOException {
        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.print((char) ch);
        }
    }

    public static void readCharList(InputStreamReader isr) throws IOException {
        char[] chars = new char[1024];
        int len;
        while ((len = isr.read(chars)) != -1) {
            System.out.print(new String(chars, 0, len));
        }
    }
}
