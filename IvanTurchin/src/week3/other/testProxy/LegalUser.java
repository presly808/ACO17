package week3.other.testProxy;

public class LegalUser implements IVkUser {

    @Override
    public void addPost(int id) {
        System.out.println("legal post added, id " + id);
    }
}
