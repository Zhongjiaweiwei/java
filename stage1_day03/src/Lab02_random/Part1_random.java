package Lab02_random;

import java.util.Random;

/**
 * 随机数Random
 */
public class Part1_random {
    public static void main(String[] args) {
        Random r=new Random();
        int i=r.nextInt(10);//0-9
        System.out.println(i);
        //如果要让i在1-10区间
        int j=r.nextInt(10)+1;
        System.out.println(j);
    }
}
