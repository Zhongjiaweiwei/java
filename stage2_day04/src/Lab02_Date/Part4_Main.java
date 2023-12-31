package Lab02_Date;

import java.text.ParseException;
import java.util.Date;

public class Part4_Main {
    public static void main(String[] args) throws ParseException {
        //创建日期对象
        Date d = new Date();
        String s1 = Part4_DateUtils.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s1);
        String s2 = Part4_DateUtils.dateToString(d, "yyyy年MM月dd日");
        System.out.println(s2);
        String s3 = Part4_DateUtils.dateToString(d, "HH:mm:ss");
        System.out.println(s3);
        System.out.println("--------");
        String s = "2048-08-09 12:12:12";
        Date dd = Part4_DateUtils.stringToDate(s, "yyyy-MM-dd HH:mm:ss");
        System.out.println(dd);
    }
}
