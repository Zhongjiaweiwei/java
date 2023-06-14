package lab01_calculate;

/**
 * 赋值运算符
 */
public class Part2_FuZhiCalculate {
    public static void main(String[] args) {
        int a;
        //  = 赋值 a=10，将10赋值给变量a
        a=10;
        System.out.println(a);//10
        //  += 加后赋值 a+=b，将a+b的值给a
        a+=10;
        System.out.println(a);//20
        //  -= 减后赋值 a-=b，将a-b的值给a
        a-=5;
        System.out.println(a);//15
        //  *= 乘后赋值 a*=b，将a×b的值给a
        a*=2;
        System.out.println(a);//30
        //  /= 除后赋值 a/=b，将a÷b的商给a
        a/=3;
        System.out.println(a);//10
        //  %= 取余后赋值 a%=b，将a÷b的余数给a
        a%=3;
        System.out.println(a);//1
    }
}
