package week3.other.testProxy;

public class ProxyController {

    public void addPost(IVkUser iVkUser, int id) {

        if (iVkUser instanceof LegalUser) {
            iVkUser.addPost(id);
        }
    }
}
