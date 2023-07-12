package lab01_thread;

public class Part1_define extends Thread{
    public static void main(String[] args) {
        /*
        void run() 在线程开启后，此方法将被调用执行
        void start() 使此线程开始执行，Java虚拟机会调用run方法()
        */
        Part1_define p1=new Part1_define();
        p1.start();

    }

    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}
