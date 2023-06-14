package lab02_dateInput;

import java.util.Scanner;

/**
 * 数据输入
 */
public class Part1_Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        System.out.println("您输入的数字是："+i);
    }
}
