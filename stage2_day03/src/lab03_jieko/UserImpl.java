package lab03_jieko;

public class UserImpl implements UserService{
    @Override
    public void save() {
        System.out.println("成功保存用户");
    }
}
