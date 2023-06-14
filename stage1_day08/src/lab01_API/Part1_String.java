package lab01_API;

public class Part1_String {
    /*字符串不可变，它们的值在创建后不能被更改
    虽然 String 的值是不可变的，但是它们可以被共享
    字符串效果上相当于字符数组( char[] )，但是底层原理是字节数组( byte[] )*/
    public static void main(String[] args) {
        //public String()：创建一个空白字符串对象，不含有任何内容
        String s1=new String();
        System.out.println(s1);
        //public String(char[] chs)：根据字符数组的内容，来创建字符串对象
        char[] chs=new char[]{'a','b','c'};
        String s2=new String(chs);
        System.out.println(s2);
        //public String(byte[] bys)：根据字节数组的内容，来创建字符串对象
        byte[] bys=new byte[]{97,98,99};
        String s3=new String(bys);
        System.out.println(s3);
        //String s = “abc”; 直接赋值的方式创建字符串对象，内容就是abc
        String s4="abc";
        System.out.println(s4);
    }
}
