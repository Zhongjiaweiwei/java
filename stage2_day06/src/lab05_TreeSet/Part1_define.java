package lab05_TreeSet;

import java.util.TreeSet;

public class Part1_define {
    public static void main(String[] args) {
        TreeSet<String> strings=new TreeSet<>();
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
