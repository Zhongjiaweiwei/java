package lab01_baozhuanlei;

public class Part2_Integer {
    /*
    public Integer(int value) 根据 int 值创建 Integer 对象(过时)
    public Integer(String s) 根据 String 值创建 Integer 对象(过时)
    public static Integer valueOf(int i) 返回表示指定的 int 值的 Integer 实例
    public static Integer valueOf(String s) 返回一个保存指定值的 Integer 对象 String
    */
    public static void main(String[] args) {
        Integer i1=new Integer(18);
        System.out.println(i1);

        Integer i2=new Integer("19");
        System.out.println(i2);

        Integer i3 = Integer.valueOf(20);
        System.out.println(i3);

        Integer i4=Integer.valueOf("21");
        System.out.println(i4);
    }
}
