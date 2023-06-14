package lab01_duixiang;

/**
 * 构造方法
 */
public class Part3_construct {
    private String username;
    public Part3_construct() {
        System.out.println("这是无参构造方法");
    }

    public Part3_construct(String username) {
        this.username = username;
        System.out.println("这是"+username+"的构造方法");
    }

    public static void main(String[] args) {
        Part3_construct p1=new Part3_construct();
        Part3_construct p2=new Part3_construct("钟佳炜");
    }
}
