package Lab02_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Part3_SimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        //public SimpleDateFormat() 构造一个SimpleDateFormat，使用默认模式和日期格式
        //public SimpleDateFormat(String pattern) 构造一个SimpleDateFormat使用给定的模式和默认的日期格式
        //public final String format(Date date)：将日期格式化成日期/时间字符串
        //public Date parse(String source)：从给定字符串的开始解析文本以生成日期

        //从 Date 到 String
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s = simpleDateFormat.format(date);
        System.out.println(s);

        //从 String 到 Date
        String s1="2023-06-15 11:06:12";
        //ParseException(格式要一致)
        //SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1=simpleDateFormat1.parse(s1);
        System.out.println(date1);
    }
}
