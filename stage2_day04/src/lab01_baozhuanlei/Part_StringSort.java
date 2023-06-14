package lab01_baozhuanlei;

import java.util.Arrays;

/**
 * 字符串排序
 */
public class Part_StringSort {
    public static void main(String[] args) {
        String s="91,92,93,80,75";
        String[] strings=s.split(",");
        int[] arr=new int[strings.length];
        for (int i=0;i<strings.length;i++){
            arr[i]=Integer.parseInt(strings[i]);
        }
        Arrays.sort(arr);
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=0;i<arr.length;i++){
            if (i== arr.length-1){
                stringBuilder.append(arr[i]);
            }else {
                stringBuilder.append(arr[i]).append(",");
            }
        }
        String s1=stringBuilder.toString();
        System.out.println(s1);
    }
}
