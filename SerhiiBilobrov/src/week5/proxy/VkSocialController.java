package week5.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serhii on 12/10/16.
 */
public class VkSocialController implements SocialController {

    private List<VkUser> userList;

    private VkSocialController() {
        userList = new ArrayList<>();
    }

    public static SocialController create() {
        return new SocialValidationController(new VkSocialController());
    }

    @Override
    public String signUp(String email, String pass) {
        userList.add(new VkUser(email, pass));
        return "successful registration";
    }

    private static class VkUser {

        String email;
        String pass;

        public VkUser(String email, String pass) {
            this.email = email;
            this.pass = pass;
        }
    }
}
