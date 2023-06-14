package lab01_method;

/**
 * 方法重载
 */
public class Part2_chongzai {
    /*多个方法在同一个类中
    多个方法具有相同的方法名
    多个方法的参数不相同，类型不同或者数量不同*/

    /*重载仅对应方法的定义，与方法的调用无关，调用方式参照标准格式
    重载仅针对同一个类中方法的名称与参数进行识别，与返回值无关，换句话说不能通过返回值来判定两
    个方法是否相互构成重载*/
    public void say(int i){
        System.out.println("我是"+i);
    }
    public void say(int i,int j){
        System.out.println("我是"+i+"和"+j);
    }
    public int say(double i){
        return (int) i;
    }

    public static void main(String[] args) {
        Part2_chongzai p=new Part2_chongzai();
        p.say(1);
        p.say(1,2);
        System.out.println(p.say(1.98));
    }
}
