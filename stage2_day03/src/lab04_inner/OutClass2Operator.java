package lab04_inner;

public class OutClass2Operator {
    public static void main(String[] args) {
        new OutClass2(){
            @Override
            public void method() {
                System.out.println("我是匿名内部类");
            }
        }.method();
    }
}
