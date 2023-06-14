package Lab02_Date;

import java.util.Calendar;

public class Part5_Calendar {
    public static void main(String[] args) {
        /*
        public int get(int field) 返回给定日历字段的值
        public abstract void add(int field, int amount) 根据日历的规则，将指定的时间量添加或减去给定的日历字段
        public final void set(int year,int month,int date) 设置当前日历的年月日
        */

        //获取日历类对象
        Calendar calendar=Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int date = calendar.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");

        calendar.add(Calendar.YEAR,-3);
        calendar.add(Calendar.DATE,10);
        calendar.add(Calendar.MONTH,-2);
        int year1 = calendar.get(Calendar.YEAR);
        int month1 = calendar.get(Calendar.MONTH) + 1;//为什么要加一，因为月份是从零开始的
        int date1 = calendar.get(Calendar.DATE);
        System.out.println(year1 + "年" + month1 + "月" + date1 + "日");

        calendar.set(2023,7,1);
        int year2 = calendar.get(Calendar.YEAR);
        int month2 = calendar.get(Calendar.MONTH);
        int date2 = calendar.get(Calendar.DATE);
        System.out.println(year2 + "年" + month2 + "月" + date2 + "日之前一定找到工作");
    }
}
