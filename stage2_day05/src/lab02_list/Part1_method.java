package lab02_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Part1_method {
    public static void main(String[] args) {
        /*void add(int index,E element) 在此集合中的指定位置插入指定的元素
        E remove(int index) 删除指定索引处的元素，返回被删除的元素
        E set(int index,E element) 修改指定索引处的元素，返回被修改的元素
        E get(int index) 返回指定索引处的元素*/
        List<Student> students=new ArrayList<>();
        Student s1=new Student("张三",18);
        Student s2=new Student("李四",19);
        Student s3=new Student("王五",20);
        students.add(s1);
        students.add(s2);
        students.add(s3);

        Iterator<Student> iterator=students.listIterator();//存在并发修改异常
        while (iterator.hasNext()){
            Student s = iterator.next();
            System.out.println(s.getUsername()+","+s.getAge());
        }
        System.out.println("-------------------------");
        for (int i=0;i<students.size();i++){
            Student student = students.get(i);
            System.out.println(student.getUsername()+","+student.getAge());
        }
        System.out.println("-------------------------");
        for (Student student:students){
            System.out.println(student.getUsername()+","+student.getAge());
        }
    }
}
