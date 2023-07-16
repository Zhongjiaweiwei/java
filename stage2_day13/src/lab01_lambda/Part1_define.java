package lab01_lambda;

public class Part1_define {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("这是一个多线程demo");
        }).start();
    }
}
