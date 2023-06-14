package lab05_TreeSet;

import java.util.TreeSet;

public class Part2_Main {
    public static void main(String[] args) {
        TreeSet<Part2_Student> ts=new TreeSet<>();
        Part2_Student p1=new Part2_Student("zhangsan",18);
        Part2_Student p2=new Part2_Student("zhangsan",18);
        Part2_Student p3=new Part2_Student("lisi",18);
        ts.add(p1);
        ts.add(p2);
        ts.add(p3);
        for (Part2_Student student:ts){
            System.out.println(student.getAge());
        }
    }
}
