package lab03_runable;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<=10;i++){
            //获取主线程的名字
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
