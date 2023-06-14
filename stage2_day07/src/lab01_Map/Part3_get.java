package lab01_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Part3_get {
    public static void main(String[] args) {
        /*V get(Object key) 根据键获取值
        Set keySet() 获取所有键的集合
        Collection values() 获取所有值的集合
        Set<Map.Entry<K,V>> entrySet() 获取所有键值对对象的集合*/
        Map<String,String> map=new HashMap<>();
        map.put("zhang","san");
        map.put("li","si");
        map.put("wang","wu");
        System.out.println(map);
        System.out.println(map.get("li"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String,String> stringStringEntry:entries){
            System.out.println(stringStringEntry);
        }
    }
}
