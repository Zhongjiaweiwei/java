package lab05_jieko;

public class Main {
    public static void main(String[] args) {
        Inter inter=new InterImpl();
        inter.show();
        System.out.println(inter.num);
        System.out.println(inter.num2);
        System.out.println(inter.num3);
        InterImpl inter1=new InterImpl();
        inter1.show();
    }
}
