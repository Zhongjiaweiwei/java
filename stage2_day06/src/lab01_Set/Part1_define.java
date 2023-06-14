package lab01_Set;

import java.util.HashSet;
import java.util.Set;

public class Part1_define {
    public static void main(String[] args) {
        /*元素存取无序
        没有索引、只能通过迭代器或增强for循环遍历
        不能存储重复元素*/
        Set<String> strings=new HashSet<>();
        strings.add("hello");
        strings.add("world");
        strings.add("welcome");
        strings.add("to");
        strings.add("java");
        strings.add("java");//被覆盖
        System.out.println(strings);
    }
}
