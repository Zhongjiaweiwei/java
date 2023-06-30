package lab02_digui;

public class Part1_jiecheng {
    public static void main(String[] args) {
        System.out.println(jc(3));//3*2*1=6
        System.out.println(jc(4));//4*3*2*1=24
    }
    public static int jc(int i){
        if (i==1){
            return i;
        }else {
            return i*jc(i-1);
        }
    }
}
