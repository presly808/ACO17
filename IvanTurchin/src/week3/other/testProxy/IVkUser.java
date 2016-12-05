package week3.other.testProxy;

public abstract class IVkUser {

    public final String login;
    public final int id;

    public IVkUser(String login, int id) {
        this.login = login;
        this.id = id;
    }

    public abstract void addPost(int id);
}
