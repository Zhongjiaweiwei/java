package lab05_producers_consumers;

public class BoxDemo {
    public static void main(String[] args) {
        Box box=new Box();
        Producer producer=new Producer(box);
        Customer customer=new Customer(box);
        Thread t1=new Thread(producer,"生产者");
        Thread t2=new Thread(customer,"消费者");
        t1.start();
        t2.start();
    }
}
