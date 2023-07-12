package lab05_producers_consumers;

public class Producer implements Runnable{
    private Box box;

    public Producer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        for (int i=1;i<=30;i++){
            box.put(i);
        }
    }
}
