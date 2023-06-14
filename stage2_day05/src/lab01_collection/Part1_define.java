package lab01_collection;

import java.util.ArrayList;
import java.util.Collection;

public class Part1_define {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        list.add("hello");
        list.add("world");
        System.out.println(list);
    }
}
