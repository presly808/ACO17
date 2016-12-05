package week3.other.testProxy;

public class Vk {

    public static void main(String[] args) {

        LegalUser legalUser = new LegalUser("legal", 1);
        IllegalUser illegalUser = new IllegalUser("illegal", 2);

        PostAddController postAddController = new PostAddController();

        postAddController.addPost(legalUser, 1);
        postAddController.addPost(illegalUser, 2);
    }
}
