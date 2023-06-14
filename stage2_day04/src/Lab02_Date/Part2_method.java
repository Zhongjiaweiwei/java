package Lab02_Date;

import java.util.Date;

public class Part2_method {
    //public long getTime() 获取的是日期对象从1970年1月1日 00:00:00到现在的毫秒值
    //public void setTime(long time) 设置时间，给的是毫秒值
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date.getTime());
        long time=System.currentTimeMillis();
        date.setTime(time);
        System.out.println(date);
    }
}
