package lab04_tongbu;

public class Part3_synchronizedMethod implements Runnable {
    private static int tickets = 100;
    private int x = 0;


    @Override
    public void run() {
        while (true) {
            sellTicket();
            if (tickets==0){
                break;
            }
        }
    }

    private static synchronized void sellTicket() {
        if (tickets > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
            tickets--;
        }
    }
}
