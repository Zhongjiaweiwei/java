package lab04_tongbu;

public class Part1_SellTicket implements Runnable{
    private int tickets=100;

    @Override
    public void run() {
        while (true){
            if (tickets>0){
                System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets+"张票");
                tickets--;
            }
        }
    }
}
