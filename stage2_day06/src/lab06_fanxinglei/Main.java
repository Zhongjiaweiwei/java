package lab06_fanxinglei;

public class Main {
    public static void main(String[] args) {
        Generic<String> s=new Generic<>();
        s.setT("钟佳炜");
        System.out.println(s.getT());
        Generic<Boolean> b=new Generic<>();
        b.setT(true);
        System.out.println(b.getT());
    }
}
