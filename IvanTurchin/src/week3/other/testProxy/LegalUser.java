package week3.other.testProxy;

public class LegalUser extends IVkUser{

    public LegalUser(String login, int id) {
        super(login, id);
    }

    @Override
    public void addPost(int id) {
        new PostAddController().addPost(this, id);
    }
}
