package lab02_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Part1_method {
    public static void main(String[] args) {
        /*
        public static void sort(List list) 将指定的列表按升序排序
        public static void reverse(List<?> list) 反转指定列表中元素的顺序
        public static void shuffle(List<?> list) 使用默认的随机源随机排列指定的列表
        */
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(11);
        list.add(10);
        list.add(15);
        list.add(16);
        System.out.println(list);//[12, 11, 10, 15, 16]
        Collections.sort(list);
        System.out.println(list);//[10, 11, 12, 15, 16]
        Collections.reverse(list);
        System.out.println(list);//[16, 15, 12, 11, 10]
        Collections.shuffle(list);
        System.out.println(list);//[11, 15, 12, 16, 10]
    }
}
