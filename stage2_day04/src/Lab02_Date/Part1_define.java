package Lab02_Date;

import java.util.Date;

public class Part1_define {
    //public Date() 分配一个 Date对象，并初始化，以便它代表它被分配的时间，精确到毫秒
    //public Date(long date) 分配一个 Date对象，并将其初始化为表示从标准基准时间起指定的毫秒数
    public static void main(String[] args) {
        Date d1=new Date();
        System.out.println(d1);

        long l=1000*60*60;//小时
        Date d2=new Date(l);
        System.out.println(d2);
    }
}
