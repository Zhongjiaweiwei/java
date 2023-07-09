package lab02_xuliehua;

import java.io.Serializable;

public class Part1_Student implements Serializable {
    private static final long serialVersionUID=42L;
    private String name;
    private transient int age;

    public Part1_Student() {
    }

    public Part1_Student(String name, int age) {
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
    public String toString() {
        return "Part1_Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
