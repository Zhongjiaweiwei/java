package lab02_pratice;

public class EatableDemo {
    public static void main(String[] args) {
        Eatable eatable=new EatableImpl();
        //调用方法方式
        useEatable(eatable);
        //匿名内部类方式
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("工作不是问题，吃饱再说");
            }
        });
        //lambda表达式方式
        useEatable(()->{
            System.out.println("只有对社会没有贡献的人才会吃饭");
        });

    }
    //该方法主要是自动实现eat方法
    private static void useEatable(Eatable eatable){
        eatable.eat();
    }
}
