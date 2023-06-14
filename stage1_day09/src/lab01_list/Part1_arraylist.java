package lab01_list;

import java.util.ArrayList;

/**
 * arraylist
 */
public class Part1_arraylist {
    public static void main(String[] args) {
        //创建
        ArrayList<String> arrayList=new ArrayList<>();
        //添加
        arrayList.add("hello");
        arrayList.add("world");
        System.out.println(arrayList);
        //指定位置添加
        arrayList.add(1,"hi");
        System.out.println(arrayList);
    }
}
