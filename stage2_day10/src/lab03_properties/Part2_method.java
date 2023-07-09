package lab03_properties;

import java.util.Properties;
import java.util.Set;

public class Part2_method {
    /*Object setProperty(String key,String value)
    设置集合的键和值，都是String类型，底层调用 Hashtable方法 put
    String getProperty(String key) 使用此属性列表中指定的键搜索属性
    Set stringPropertyNames()从该属性列表中返回一个不可修改的键集，其中键及其对应的值是字符串*/
    public static void main(String[] args) {
        Properties prop=new Properties();
        prop.put("zjw","lmy");
        String zjw = prop.getProperty("zjw");
        System.out.println(zjw);
        Set<String> strings = prop.stringPropertyNames();
        for (String s:strings){
            String o = prop.getProperty(s);
            System.out.println(s+","+o);
        }
    }
}
