package lab02_control;

public class ThreadJoinDemo {
    public static void main(String[] args) {
        //void join() 等待这个线程死亡
        ThreadJoin p1=new ThreadJoin("张三");
        ThreadJoin p2=new ThreadJoin("李四");
        ThreadJoin p3=new ThreadJoin("王五");
        p1.start();
        //只有当线程1挂了死亡以后线程2和3才可以执行
        try {
            p1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        p2.start();
        p3.start();
    }
}
