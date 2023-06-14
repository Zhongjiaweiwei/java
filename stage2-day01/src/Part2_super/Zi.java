package Part2_super;

public class Zi extends Fu{
    private String name;
    public void say(){
        super.setName("钟佳炜");
        this.name="彭于晏";
        System.out.println(super.getName()+","+this.name);
    }

    public static void main(String[] args) {
        Zi zi=new Zi();
        zi.say();
    }
}
