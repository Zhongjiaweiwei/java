package lab01_method;

/**
 * 方法定义和调用
 */
public class Part1_define {
    //带参
    public static int add(int i){
        return i+=1;
    }
    //无参
    public static int getMax(int[] ints){
        int max=ints[0];
        for (int i=0;i< ints.length;i++){
            if (ints[i]>max){
                max=ints[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(add(1));
        System.out.println(getMax(new int[]{1,3,6,4,2}));
    }
}
