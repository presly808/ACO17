package by_video.design_patterns.social_network.facebook;

import by_video.design_patterns.social_network.common.SocialNetworkApi;

public class FacebookApi implements SocialNetworkApi {

    @Override
    public String login(String email, String pass) {
        return "facebook key";
    }

    @Override
    public int createGroup(String name) {
        System.out.println("Facebook group " + name);
        return 1;
    }

    public FacebookGroup get(int id) {
        return new FacebookGroup();
    }
}
