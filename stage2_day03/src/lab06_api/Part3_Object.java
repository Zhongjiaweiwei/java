package lab06_api;

public class Part3_Object {
    static class hello{
        private String username;

        @Override
        public String toString() {
            return "hello{" +
                    "username='" + username + '\'' +
                    '}';
        }
    }
    static class world{
        private int age;
    }

    public static void main(String[] args) {
        //未重写toString方法时
        world w=new world();
        System.out.println(w.toString());//lab06_api.Part3_Object$world@4554617c
        //重写toString后
        hello hello=new hello();
        System.out.println(hello.toString());//hello{username='null'}
    }
}
