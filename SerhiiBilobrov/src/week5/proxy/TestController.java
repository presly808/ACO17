package week5.proxy;

/**
 * Created by serhii on 12/10/16.
 */
public class TestController {


    public static void main(String[] args) {
        SocialController socialController = VkSocialController.create();
        String res = socialController.signUp("email@email.com", "12345");
        System.out.println(res);
    }
}
