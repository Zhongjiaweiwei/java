package lab02_control;

public class ThreadJoin extends Thread{
    @Override
    public void run() {
        for (int i=0;i<=10;i++){
            System.out.println(getName()+":"+i);
        }
    }

    public ThreadJoin() {
    }

    public ThreadJoin(String name) {
        super(name);
    }
}
