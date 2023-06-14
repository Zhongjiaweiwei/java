package lab02_hash;

public class Monkey {
    private String name;
    private String addr;

    public Monkey(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    public Monkey() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
