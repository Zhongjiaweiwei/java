package lab03_properties;

import java.util.Properties;
import java.util.Set;

public class Part1_define {
    /*
    Properties介绍是一个Map体系的集合类
    Properties可以保存到流中或从流中加载
    属性列表中的每个键及其对应的值都是一个字符串
    */
    public static void main(String[] args) {
        Properties prop=new Properties();
        prop.put("zjw","lmy");
        prop.put("zhangsan","lisi");
        Set<Object> keySet=prop.keySet();
        for (Object o:keySet){
            Object value=prop.get(o);
            System.out.println("key:"+o+",value:"+value);
        }
    }
}
