package lab01_shuzu;

/**
 * 数组定义
 */
public class Part1_define {
    public static void main(String[] args) {
        //动态初始化
        int[] ints1=new int[3];//数组长度为3
        System.out.println(ints1[0]);//索引为0
        //静态初始化
        int[] ints2={1,2,3};
        int[] ints3=new int[]{1,2,3,4};
        System.out.println(ints2[0]);
        System.out.println(ints3[2]);
    }
}
