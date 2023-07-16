package lab05_yinyongduixiang;

public class PrinterDemo {
    public static void main(String[] args) {
        usePrinter(new PrintString()::printUpper);
    }
    public static void usePrinter(Printer printer){
        printer.printUpperCase("hello world");
    }
}
