package lab01_collection;

import java.util.ArrayList;
import java.util.Collection;

public class Part2_method {
    public static void main(String[] args) {
        /*boolean add(E e) 添加元素
        boolean remove(Object o) 从集合中移除指定的元素
        void clear() 清空集合中的元素
        boolean contains(Object o) 判断集合中是否存在指定的元素
        boolean isEmpty() 判断集合是否为空
        int size() 集合的长度，也就是集合中元素的个数*/
        Collection<String> list=new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("welcome");
        list.add("to");
        list.add("java");

        System.out.println(list.remove("world"));
        System.out.println(list.contains("hello"));
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
    }
}
