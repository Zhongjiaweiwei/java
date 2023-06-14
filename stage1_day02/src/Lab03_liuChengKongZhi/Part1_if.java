package Lab03_liuChengKongZhi;

import java.util.Scanner;

/**
 * if语句
 */
public class Part1_if {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入一个数字:");
        int i=scanner.nextInt();
        if (i>20){
            System.out.println("该数大于20");
        } else if (i<=20) {
            System.out.println("该数小于等于20");
        }else {
            System.out.println("请正确输入");
        }
    }
}
