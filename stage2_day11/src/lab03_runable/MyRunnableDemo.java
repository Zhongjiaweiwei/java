package lab03_runable;

public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable runnable=new MyRunnable();
        Thread p1=new Thread(runnable,"线程1");
        Thread p2=new Thread(runnable,"线程2");
        p1.start();
        p2.start();
    }
}
