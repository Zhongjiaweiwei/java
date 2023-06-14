package Part3_chongxie;

public class Duck extends Animal{

    //子类方法访问权限不能更低(public > 默认 > 私有)
    @Override
    public void dance() {
        System.out.println("鸭子会跳舞");
    }
}
