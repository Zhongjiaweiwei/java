package lab02_haochu;

public class Main {
    public static void main(String[] args) {
        PeopleOperator peopleOperator=new PeopleOperator();
        peopleOperator.toDo(new Student());
        peopleOperator.toDo(new Teacher());
    }
}
