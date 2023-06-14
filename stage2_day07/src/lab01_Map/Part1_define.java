package lab01_Map;

import java.util.HashMap;
import java.util.Map;

public class Part1_define {
    public static void main(String[] args) {
        /*键值对映射关系
        一个键对应一个值
        键不能重复，值可以重复
        元素存取无序*/
        Map<String,String> map=new HashMap<>();
        map.put("zhang","san");
        map.put("li","si");
        map.put("wang","wu");
        System.out.println(map);
    }
}
