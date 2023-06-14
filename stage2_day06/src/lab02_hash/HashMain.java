package lab02_hash;

public class HashMain {
    public static void main(String[] args) {
        Monkey monkey=new Monkey("金丝猴","峨眉山");
        Monkey monkey1=new Monkey("石猴","花果山");
        System.out.println(monkey.hashCode());
        System.out.println(monkey.hashCode());//同一个对象多次调用hashCode()方法返回的哈希值是相同的
        //默认情况下，不同对象的哈希值是不同的。而重写hashCode()方法，可以实现让不同对象的哈希值相同
        System.out.println(monkey1.hashCode());
    }
}
