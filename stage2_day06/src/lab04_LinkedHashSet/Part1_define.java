package lab04_LinkedHashSet;

import java.util.LinkedHashSet;

public class Part1_define {
    public static void main(String[] args) {
        /*哈希表和链表实现的Set接口，具有可预测的迭代次序
        由链表保证元素有序，也就是说元素的存储和取出顺序是一致的
        由哈希表保证元素唯一，也就是说没有重复的元素*/
        LinkedHashSet<String> strings=new LinkedHashSet<>();
        strings.add("hello");
        strings.add("world");
        strings.add("welcome");
        strings.add("to");
        strings.add("java");
        for (String s:strings){
            System.out.println(s);
        }
    }
}
