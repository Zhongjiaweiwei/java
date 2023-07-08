package Part1_extends;

public class Main {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.setName("钟佳炜");
        teacher.teach();
        Student student=new Student();
        student.setName("彭于晏");
        student.study();
    }
}
