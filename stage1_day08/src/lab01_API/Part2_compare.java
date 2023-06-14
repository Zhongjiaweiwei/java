package lab01_API;

public class Part2_compare {
    public static void main(String[] args) {
        String s1=new String("abc");
        String s2=new String("abc");
        System.out.println(s1==s2);//比较的是字符串的地址
        System.out.println(s1.equals(s2));//比较的是字符串的内容
    }
}
