package lab03_exception;

public class Part1_try_catch {
    public static void main(String[] args) {
        try {
            int i=1/0;
        }catch (Exception e){
            System.out.println("程序出现异常了，请检查代码");
        }
    }
}
