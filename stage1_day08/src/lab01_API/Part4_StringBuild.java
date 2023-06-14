package lab01_API;

/**
 * StringBuild类型
 */
public class Part4_StringBuild {
    public static void main(String[] args) {
        //创建一个空白可变字符串对象，不含有任何内容
        StringBuilder sb1=new StringBuilder();
        System.out.println(sb1);
        //根据字符串的内容，来创建可变字符串对象
        StringBuilder sb2=new StringBuilder("abcd");
        System.out.println(sb2);

        //长度
        System.out.println(sb2.length());
        //拼接
        System.out.println(sb2.append("efg"));
        //反转
        System.out.println(sb2.reverse());
    }
}
