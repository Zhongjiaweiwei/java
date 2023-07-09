package lab03_properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Part3_unionIO {
    public static void main(String[] args) throws IOException {
        /*void load(InputStream inStream)从输入字节流读取属性列表（键和元素对）
        void load(Reader reader) 从输入字符流读取属性列表（键和元素对）
        void store(OutputStream out, String comments)将此属性列表（键和元素对）写入此 Properties表中，以适合于使用
        load(InputStream)方法的格式写入输出字节流
        void store(Writer writer,String comments)将此属性列表（键和元素对）写入此 Properties表中，以适合使用
        load(Reader)方法的格式写入输出字符流*/

        //myStore();
        myLoad();
    }
    //把文件中的数据加载到集合
    private static void myLoad() throws IOException{
        Properties prop=new Properties();
        FileReader fr=new FileReader("stage2_day10/src/myFile/fr.txt");
        prop.load(fr);
        fr.close();
        System.out.println(prop);
    }
    //把集合中的数据保存到文件
    private static void myStore() throws IOException{
        Properties prop = new Properties();
        prop.setProperty("itheima001","林青霞");
        prop.setProperty("itheima002","张曼玉");
        prop.setProperty("itheima003","王祖贤");
        FileWriter fw=new FileWriter("stage2_day10/src/myFile/fr.txt");
        prop.store(fw,null);
        fw.close();
    }
}
