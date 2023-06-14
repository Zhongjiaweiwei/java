package lab02_chouxianglei;

public class Main {
    public static void main(String[] args) {
        PeopleOperator peopleOperator=new PeopleOperator();
        peopleOperator.setPeople(new Student());
        People people = peopleOperator.getPeople();
        people.eat();
    }
}
