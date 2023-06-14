package lab01_calculate;

/**
 * 逻辑运算符
 */
public class Part5_LuoJiCalculate {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        //  & 逻辑与 a&b，a和b都是true，结果为true，否则为false
        System.out.println(a&b);//false
        //  | 逻辑或 a|b，a和b都是false，结果为false，否则为true
        System.out.println(a|b);//true
        //  ^ 逻辑异或 a^b，a和b结果不同为true，相同为false
        System.out.println(a^b);//true
        //  ! 逻辑非 !a，结果和a的结果正好相反
        System.out.println(!a);//false


        /*逻辑与&，无论左边真假，右边都要执行。
        短路与&&，如果左边为真，右边执行；如果左边为假，右边不执行。
        逻辑或|，无论左边真假，右边都要执行。
        短路或||，如果左边为假，右边执行；如果左边为真，右边不执行。*/
        //  && 短路与 作用和&相同，但是有短路效果
        int i=1;
        System.out.println(true&&i++==2);
        System.out.println(i);//2
        int j=1;
        System.out.println(false&&j++==2);
        System.out.println(j);//1
        //  || 短路或 作用和|相同，但是有短路效果
        int k=1;
        System.out.println(true||k++==2);
        System.out.println(k);//1
        int l=1;
        System.out.println(false||l++==2);
        System.out.println(l);//2
    }
}
