package lab01_shuzu;

/**
 * 获取最值
 */
public class Part3_getMax_Min {
    public static void main(String[] args) {
        int[] ints={1,2,3,4,6,7,5};
        int max=ints[0];
        for (int i=0;i<ints.length;i++){
            if (ints[i]>max){
                max=ints[i];
            }
        }
        System.out.println(max);
        int min=ints[0];
        for (int i=0;i<ints.length;i++){
            if (ints[i]<min){
                min=ints[i];
            }
        }
        System.out.println(min);
    }
}
