package lab01_list;

import java.util.ArrayList;

/**
 * 常用方法
 */
public class Part2_method {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("welcome");
        arrayList.add("to");
        arrayList.add("java");

        //删除
        System.out.println(arrayList.remove("hello"));
        //指定位置删除
        System.out.println(arrayList.remove(1));
        //修改指定索引处的元素，返回被修改的元素
        System.out.println(arrayList.set(0,"world"));
        //返回指定索引处的元素
        System.out.println(arrayList.get(0));
        //返回集合中的元素的个数
        System.out.println(arrayList.size());
        //将指定的元素追加到此集合的末尾
        System.out.println(arrayList.add("aiyo"));
        //在此集合中的指定位置插入指定的元素
        arrayList.add(1,"hhh");
    }
}
