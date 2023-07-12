package lab02_control;

public class ThreadSleepDemo {
    public static void main(String[] args) {
        //static void sleep(long millis) 使当前正在执行的线程停留（暂停执行）指定的毫秒数
        ThreadSleep p1=new ThreadSleep("线程1");
        ThreadSleep p2=new ThreadSleep("线程2");
        ThreadSleep p3=new ThreadSleep("线程3");
        p1.start();
        p2.start();
        p3.start();
    }
}
