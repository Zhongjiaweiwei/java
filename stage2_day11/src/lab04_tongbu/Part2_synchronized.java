package lab04_tongbu;

/**
 * 同步代码块
 */
public class Part2_synchronized implements Runnable{
    private int tickets=100;
    private Object obj=new Object();
    @Override
    public void run() {
        while (true){
            /*好处：解决了多线程的数据安全问题
            弊端：当线程很多时，因为每个线程都会去判断同步上的锁，这是很耗费资源的，无形中会降低程序的运行效率*/
            synchronized (obj){
                if (tickets>0){
                    //模拟出票
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets+"张票");
                    tickets--;
                }
            }
        }
    }
}
