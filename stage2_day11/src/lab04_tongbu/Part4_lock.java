package lab04_tongbu;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Part4_lock implements Runnable{
    private int tickets=100;
    /*Lock是接口不能直接实例化，这里采用它的实现类ReentrantLock来实例化
    void lock() 获得锁
    void unlock() 释放锁*/
    private Lock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true){
            try{
                lock.lock();
                if (tickets>0){
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                    tickets--;
                }
            }finally {
                lock.unlock();
            }
        }
    }
}
