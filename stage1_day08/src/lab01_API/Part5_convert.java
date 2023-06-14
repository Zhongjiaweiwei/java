package lab01_API;

/**
 * string和StringBuild的相互转换
 */
public class Part5_convert {
    public static void main(String[] args) {
        //StringBuilder 转换为 String
        StringBuilder sb1=new StringBuilder("abc");
        String s1=sb1.toString();

        //String 转换为 StringBuilder
        String s2="hello";
        StringBuilder sb2=new StringBuilder(s2);


        System.out.println(s1);
        System.out.println(sb2);
    }
}
