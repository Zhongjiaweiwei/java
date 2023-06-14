package lab06_api;

public class Part2_System {
    //public static void exit(int status) 终止当前运行的 Java 虚拟机，非零表示异常终止
    //public static long currentTimeMillis() 返回当前时间(以毫秒为单位)
    public static void main(String[] args) throws InterruptedException {
        //计算耗时时间
        long start = System.currentTimeMillis();
        Thread.sleep(4);
        long end=System.currentTimeMillis();
        System.out.println("执行了"+(end-start)+"毫秒");

        for (int i=0;i<=100;i++){
            System.out.println(i);
            if (i==10){
                System.exit(0);//正常终止
            }
        }

    }
}
