package lab03_jieko;

public class Main {
    public static void main(String[] args) {
        UserOperator userOperator=new UserOperator();
        userOperator.setUser(new UserImpl());
        UserService user = userOperator.getUser();
        user.save();
    }
}
