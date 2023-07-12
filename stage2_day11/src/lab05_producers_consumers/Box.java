package lab05_producers_consumers;

/**
 * 奶箱类(Box)：定义一个成员变量，表示第x瓶奶，提供存储牛奶和获取牛奶的操作
 * 生产者类(Producer)：实现Runnable接口，重写run()方法，调用存储牛奶的操作
 * 消费者类(Customer)：实现Runnable接口，重写run()方法，调用获取牛奶的操作
 * 测试类(BoxDemo)：里面有main方法，main方法中的代码步骤如下
 * ①创建奶箱对象，这是共享数据区域
 * ②创建消费者创建生产者对象，把奶箱对象作为构造方法参数传递，因为在这个类中要调用存储牛奶的操作
 * ③对象，把奶箱对象作为构造方法参数传递，因为在这个类中要调用获取牛奶的操作
 * ④创建2个线程对象，分别把生产者对象和消费者对象作为构造方法参数传递
 * ⑤启动线程
 * void wait() 导致当前线程等待，直到另一个线程调用该对象的 notify()方法或 notifyAll()方法
 * void notify() 唤醒正在等待对象监视器的单个线程
 * void notifyAll() 唤醒正在等待对象监视器的所有线程
 */
public class Box {
    //第几瓶奶
    private int milk;
    //奶箱的状态
    private boolean state=false;
    //存牛奶
    public synchronized void put(int milk){
        if (state){
            try {
                wait();//模拟消费
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //如果没有牛奶，就生产牛奶
        this.milk=milk;
        System.out.println("送奶工将第" + this.milk + "瓶奶放入奶箱");
        //生产完毕之后，修改奶箱状态
        state = true;
        notifyAll();
    }
    //拿牛奶
    public synchronized void get(){
        if (!state){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //如果有牛奶，就消费牛奶
        System.out.println("用户拿到第" + this.milk + "瓶奶");
        //消费完毕之后，修改奶箱状态
        state=false;
        //唤醒其他等待的线程
        notifyAll();
    }

    public int getMilk() {
        return milk;
    }
}
