package lab01_calculate;

/**
 * 自增自减
 */
public class Part3_ZiZengZiJianCalculate {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        int c=1;
        int d=1;
        //++ 自增 变量的值加1
        System.out.println(a++);//参与操作的时候，如果放在变量的后边，先拿变量参与操作，后拿变量做++或者--。1
        System.out.println(++b);//参与操作的时候，如果放在变量的前边，先拿变量做++或者--，后拿变量参与操作。2
        //-- 自减 变量的值减1
        System.out.println(c--);//1
        System.out.println(--d);//0
    }
}
