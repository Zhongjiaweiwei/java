package lab03_jieko;

public class UserOperator {
    public void setUser(UserService userService){
        userService.save();
    }
    public UserService getUser(){
        UserService userService=new UserImpl();
        return userService;
    }
}
