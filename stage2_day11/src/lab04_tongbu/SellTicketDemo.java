package lab04_tongbu;

public class SellTicketDemo {
    public static void main(String[] args) {
        //Part1_SellTicket part1SellTicket =new Part1_SellTicket();
        //Part2_synchronized part1SellTicket=new Part2_synchronized();
        //Part3_synchronizedMethod part1SellTicket=new Part3_synchronizedMethod();
        Part4_lock part1SellTicket=new Part4_lock();
        Thread p1=new Thread(part1SellTicket,"窗口1");
        Thread p2=new Thread(part1SellTicket,"窗口2");
        Thread p3=new Thread(part1SellTicket,"窗口3");
        p1.start();
        p2.start();
        p3.start();
    }
}
