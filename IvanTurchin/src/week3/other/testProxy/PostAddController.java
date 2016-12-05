package week3.other.testProxy;

public class PostAddController {

    public void addPost(IVkUser vkUser, int id) {

        if (vkUser instanceof LegalUser) {
            vkUser.addPost(id);
        }
    }
}
