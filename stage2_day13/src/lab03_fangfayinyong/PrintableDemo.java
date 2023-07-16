package lab03_fangfayinyong;

public class PrintableDemo {
    public static void main(String[] args) {
        //调用方法
        usePrintable(new Printable() {
            @Override
            public void printString(String s) {
                System.out.println("呵呵");
            }
        });
        //lambda简化
        usePrintable((String s)->{
            System.out.println(s);
        });
        //方法引用
        usePrintable(System.out::println);
    }
    private static void usePrintable(Printable printable){
        printable.printString("这是一个字符串");
    }
}
