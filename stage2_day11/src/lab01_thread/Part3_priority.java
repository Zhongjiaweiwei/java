package lab01_thread;

public class Part3_priority extends Thread{
    /*final int getPriority() 返回此线程的优先级
    final void setPriority(int newPriority)更改此线程的优先级 线程默认优先级是5；线程优先级的范围是：1-10
    */
    public static void main(String[] args) {
        Part3_priority p1=new Part3_priority("线程1");
        p1.setPriority(10);
        Part3_priority p2=new Part3_priority("线程2");
        p2.setPriority(1);
        System.out.println(p1.getName()+",优先级："+p1.getPriority());
        p1.start();
        System.out.println(p2.getName()+",优先级："+p2.getPriority());
        p2.start();
        System.out.println(Thread.MAX_PRIORITY); //10
        System.out.println(Thread.MIN_PRIORITY); //1
        System.out.println(Thread.NORM_PRIORITY); //5
    }

    @Override
    public void run() {
        for (int i=0;i<=5;i++){
            System.out.println(getName());
        }
    }

    public Part3_priority() {
    }

    public Part3_priority(String name) {
        super(name);
    }
}
