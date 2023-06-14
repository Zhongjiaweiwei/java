package lab04_inner;

/**
 * 局部内部类
 */
public class OutClass {
    private int num1=20;
    public void say(){
        int num2=10;
        class InClass{//局部内部类，外界是无法直接使用，需要在方法内部创建对象并使用
            public void show(){
                System.out.println(num1);
                System.out.println(num2);
            }

        }
        InClass inClass=new InClass();
        inClass.show();
    }

    public static void main(String[] args) {
        OutClass outClass=new OutClass();
        outClass.say();
    }
}
