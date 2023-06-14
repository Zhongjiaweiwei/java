package lab06_api;

public class Part1_Math {
    public static void main(String[] args) {
        /*
        public static int abs(int a) 返回参数的绝对值
        public static double ceil(double a)返回大于或等于参数的最小double值，等于一个整数
        public static double floor(double a)返回小于或等于参数的最大double值，等于一个整数
        public static int round(float a) 按照四舍五入返回最接近参数的int
        public static int max(int a,int b) 返回两个int值中的较大值
        public static int min(int a,int b) 返回两个int值中的较小值
        public static double pow (double a,double b) 返回a的b次幂的值
        public static double random() 返回值为double的正值，[0.0,1.0)
        */
        System.out.println(Math.abs(-10));//10
        System.out.println(Math.ceil(2.55));//3.0
        System.out.println(Math.floor(2.55));//2.0
        System.out.println(Math.round(2.4));//2
        System.out.println(Math.round(2.5));//3
        System.out.println(Math.max(2,3));//3
        System.out.println(Math.min(2,3));//2
        System.out.println(Math.pow(2,3));//8.0
        System.out.println(Math.random());//0.2583812610062658
    }
}
