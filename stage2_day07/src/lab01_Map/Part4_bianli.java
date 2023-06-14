package lab01_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Part4_bianli {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("zhang","san");
        map.put("li","si");
        map.put("wang","wu");
        System.out.println(map);
        //获取所有键的集合。用keySet()方法实现
        Set<String> keySet = map.keySet();
        //遍历键的集合，获取到每一个键。用增强for实现
        for (String key : keySet) {
        //根据键去找值。用get(Object key)方法实现
            String value = map.get(key);
            System.out.println(key + "," + value);
        }
        System.out.println("---------------------");

        //获取所有键值对对象的集合
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        //遍历键值对对象的集合，得到每一个键值对对象
        for (Map.Entry<String, String> me : entrySet) {
        //根据键值对对象获取键和值
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key + "," + value);
        }
    }
}
