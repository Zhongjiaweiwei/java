package Lab01_liuChengKongZhi;

import java.util.Scanner;

/**
 * switch语句
 */
public class Part1_switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入一个整数（1-7）：");
        int i = scanner.nextInt();
        switch (i){
            case 1:
                System.out.println("今天是周一");
                break;
            case 2:
                System.out.println("今天是周二");
                break;
            case 3:
                System.out.println("今天是周三");
                break;
            case 4:
                System.out.println("今天是周四");
                break;
            case 5:
                System.out.println("今天是周五");
                break;
            case 6:
                System.out.println("今天是周六");
                break;
            case 7:
                System.out.println("今天是周日");
                break;
            default:
                System.out.println("输入格式错误");
                break;//可写可不写
        }
    }
}
