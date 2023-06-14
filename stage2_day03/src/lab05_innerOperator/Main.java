package lab05_innerOperator;

public class Main {
    public static void main(String[] args) {
        //如果不需要匿名内部类的话
        JumppingOperator jumppingOperator=new JumppingOperator();
        jumppingOperator.method(new Tiger());
        jumppingOperator.method(new Cat());

        //每次调用方法都得实例化，不如用匿名内部类
        jumppingOperator.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("这是匿名内部类");
            }
        });
    }
}
