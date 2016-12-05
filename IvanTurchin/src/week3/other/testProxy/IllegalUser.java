package week3.other.testProxy;

public class IllegalUser extends IVkUser{

    public IllegalUser(String login, int id) {
        super(login, id);
    }

    @Override
    public void addPost(int id) {
        new PostAddController().addPost(this, id);
    }
}
