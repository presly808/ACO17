package week3.other.testProxy;

public class Vk {

    public static void main(String[] args) {

        LegalUser legalUser = new LegalUser("legal", 1);
        IllegalUser illegalUser = new IllegalUser("illegal", 2);

        legalUser.addPost(1);
        illegalUser.addPost(2);
    }
}
