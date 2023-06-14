package lab04_inner;

/**
 * 普通内部类
 */
public class Outer {
    //内部类可以直接访问外部类的成员，包括私有
    //外部类要访问内部类的成员，必须创建对象
    private int age=10;
    public void method(){
        System.out.println("这是外部类的方法");
    }
    public class Inter{
        public void show(){
            System.out.println(age);
            method();
        }

    }
    public void say(){
        Inter inter=new Inter();
        inter.show();
    }
    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.say();
        //或者
        Outer.Inter inter=new Outer().new Inter();
        inter.show();
    }
}
