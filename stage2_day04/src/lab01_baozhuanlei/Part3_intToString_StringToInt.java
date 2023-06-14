package lab01_baozhuanlei;

/**
 * int和String相互转换
 */
public class Part3_intToString_StringToInt {
    public static void main(String[] args) {
        //int转换为String
        int i1=100;
        String s1=i1+"";
        int i2=200;
        String s2=String.valueOf(i2);
        System.out.println(s1+" "+s2);

        //String转换为int
        String s3="300";
        Integer i = Integer.valueOf(s3);
        int i3=i.intValue();

        String s4="400";
        int i4=Integer.parseInt(s4);
        System.out.println(i3+" "+i4);
    }
}
