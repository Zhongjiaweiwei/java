package lab03_exception;

public class Part2_Throwable {
    public static void main(String[] args) {
        /*public String getMessage() 返回此 throwable 的详细消息字符串
        public String toString() 返回此可抛出的简短描述
        public void printStackTrace() 把异常的错误信息输出在控制台*/

        try{
            int[] arr={1,2,3};
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException ex){
//            ex.printStackTrace();
//            System.out.println(ex.getMessage());
            System.out.println(ex.toString());
        }
    }
}
