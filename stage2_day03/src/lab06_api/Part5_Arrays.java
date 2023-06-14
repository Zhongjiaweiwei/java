package lab06_api;

import java.util.Arrays;

public class Part5_Arrays {
    //public static String toString(int[] a) 返回指定数组的内容的字符串表示形式
    //public static void sort(int[] a) 按照数字顺序排列指定的数组
    public static void main(String[] args) {
        int[] arr={11,22,33,44,10,23,42};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
