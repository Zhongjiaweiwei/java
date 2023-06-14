package lab03_hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Part1_define {
    public static void main(String[] args) {
        /*底层数据结构是哈希表
        对集合的迭代顺序不作任何保证，也就是说不保证存储和取出的元素顺序一致
        没有带索引的方法，所以不能使用普通for循环遍历
        由于是Set集合，所以是不包含重复元素的集合*/
        HashSet<String> strings=new HashSet<>();
        strings.add("hello");
        strings.add("world");
        strings.add("welcome");
        strings.add("to");
        strings.add("java");
        Iterator<String> stringIterator=strings.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }
        System.out.println("----------------");
        for (String s:strings){
            System.out.println(s);
        }
    }
}
