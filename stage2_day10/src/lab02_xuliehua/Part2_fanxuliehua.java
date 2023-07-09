package lab02_xuliehua;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 反序列化
 */
public class Part2_fanxuliehua {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*对象反序列化流： ObjectInputStream
        ObjectInputStream反序列化先前使用ObjectOutputStream编写的原始数据和对象
        ObjectInputStream(InputStream in) 创建从指定的InputStream读取的ObjectInputStream
        Object readObject() 从ObjectInputStream读取一个对象*/
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("stage2_day10/src/myFile/oos.txt"));
        Part1_Student student= (Part1_Student) ois.readObject();
        System.out.println(student);

    }
}
