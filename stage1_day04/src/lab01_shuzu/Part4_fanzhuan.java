package lab01_shuzu;

import java.util.Arrays;

/**
 * 数组反转
 */
public class Part4_fanzhuan {
    public static void main(String[] args) {
        int[] ints={1,2,3,4,6,7,5};
        for (int start=0,end=ints.length-1;start<=end;start++,end--){
            int temp=ints[start];
            ints[start]=ints[end];
            ints[end]=temp;
        }
        System.out.println(Arrays.toString(ints));//数组输出
    }
}
