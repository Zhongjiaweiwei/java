package lab01_thread;

public class Part2_method extends Thread{
    public static void main(String[] args) {
        /*
        void setName(String name) 将此线程的名称更改为等于参数name
        String getName() 返回此线程的名称
        Thread currentThread() 返回对当前正在执行的线程对象的引用
        */
        Part2_method p1=new Part2_method();
        p1.setName("线程1");
        Part2_method p2=new Part2_method("线程2");
        System.out.print(p1.getName()+":");
        p1.start();
        System.out.print(p2.getName()+":");
        p2.start();
    }

    @Override
    public void run() {
        for (int i=0;i<=20;i++){
            if (i==20){
                System.out.println(i);
            }else {
                System.out.print (i+",");
            }
        }
    }

    public Part2_method() {
    }

    public Part2_method(String name) {
        super(name);
    }
}
