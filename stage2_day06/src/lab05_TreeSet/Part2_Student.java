package lab05_TreeSet;

public class Part2_Student implements Comparable<Part2_Student>{
    private String name;
    private int age;
    public Part2_Student() {
    }
    public Part2_Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public int compareTo(Part2_Student s) {
        int num=this.age-s.age;
        return num==0? this.name.compareTo(s.name):num;
    }
}
