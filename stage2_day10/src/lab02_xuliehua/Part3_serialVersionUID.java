package lab02_xuliehua;

public class Part3_serialVersionUID {
    public static void main(String[] args) {
        /*
        用对象序列化流序列化了一个对象后，假如我们修改了对象所属的类文件，读取数据会不会出问题呢？
        会出问题，会抛出InvalidClassException异常
        如果出问题了，如何解决呢？
        重新序列化
        给对象所属的类加一个serialVersionUID
        private static final long serialVersionUID = 42L;*/
    }
}
