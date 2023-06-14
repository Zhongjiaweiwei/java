package lab05_jieko;

public interface Inter {
    public int num=10;//默认只能是常量(被public static final修饰)
    public static final int num2=20;
    int num3=30;
    public abstract void method();
    void show();
}
