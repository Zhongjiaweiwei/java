package lab02_list;

import java.util.LinkedList;
import java.util.List;

public class Part2_LinkedList {
    public static void main(String[] args) {
        /*
        public void addFirst(E e) 在该列表开头插入指定的元素
        public void addLast(E e) 将指定的元素追加到此列表的末尾
        public E getFirst() 返回此列表中的第一个元素
        public E getLast() 返回此列表中的最后一个元素
        public E removeFirst() 从此列表中删除并返回第一个元素
        public E removeLast() 从此列表中删除并返回最后一个元素
        */
        LinkedList<String> list=new LinkedList<>();
        list.addFirst("hello");
        list.addFirst("world");
        System.out.println(list);
        list.add("hi");
        System.out.println(list);
        list.addLast("钟佳炜");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list);

    }
}
