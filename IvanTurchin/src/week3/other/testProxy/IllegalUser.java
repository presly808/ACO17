package week3.other.testProxy;

public class IllegalUser implements IVkUser {

    @Override
    public void addPost(int id) {
        System.out.println("illegal post added, id " + id);
    }
}
