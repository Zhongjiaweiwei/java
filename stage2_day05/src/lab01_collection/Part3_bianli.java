package lab01_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Part3_bianli {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("welcome");
        list.add("to");
        list.add("java");
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
