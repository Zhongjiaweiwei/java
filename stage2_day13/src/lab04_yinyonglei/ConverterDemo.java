package lab04_yinyonglei;

public class ConverterDemo {
    public static void main(String[] args) {
        useConvert(Integer::parseInt);
    }
    private static void useConvert(Converter converter){

        System.out.println(converter.convert("777"));
    }
}
