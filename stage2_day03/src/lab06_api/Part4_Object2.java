package lab06_api;

public class Part4_Object2 {
    public static class Student{
        private String username;
        private int age;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Student(String username, int age) {
            this.username = username;
            this.age = age;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            if (age != student.age) return false;
            return username != null ? username.equals(student.username) : student.username == null;
        }
    }

    public static void main(String[] args) {
        Student student1=new Student("张三",18);
        Student student2=new Student("张三",18);
        System.out.println(student1==student2);
        System.out.println(student1.equals(student2));
    }
}
