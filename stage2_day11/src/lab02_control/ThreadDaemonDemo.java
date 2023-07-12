package lab02_control;

public class ThreadDaemonDemo {
    public static void main(String[] args) {
        //void setDaemon(boolean on)将此线程标记为守护线程，当运行的线程都是守护线程时，Java虚拟机将退出
        ThreadDaemon p2=new ThreadDaemon("关羽");
        ThreadDaemon p3=new ThreadDaemon("张飞");
        //设置主线程
        Thread.currentThread().setName("刘备");
        p2.setDaemon(true);
        p3.setDaemon(true);
        p2.start();
        p3.start();
        for (int i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
