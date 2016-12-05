package week3.other.testProxy;

public class VkApi {

    public void addPost(IVkUser vkUser, int id) {
        new ProxyController().addPost(vkUser, id);
    }
}
