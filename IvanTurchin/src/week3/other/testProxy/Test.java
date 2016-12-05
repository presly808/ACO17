package week3.other.testProxy;

public class Test {

    public static void main(String[] args) {

        // I don't guess, that factory need there
        VkApi vkApi = new VkApi();

        IVkUser illegal = new IllegalUser();
        IVkUser legal = new LegalUser();

        vkApi.addPost(illegal, 1);
        vkApi.addPost(legal, 2);
    }
}
