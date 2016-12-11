package by_video.design_patterns.social_network.common;

public class SocialNetworkProxy implements SocialNetworkApi{

    private SocialNetworkApi target;

    public SocialNetworkProxy(SocialNetworkApi target) {
        this.target = target;
    }

    @Override
    public String login(String email, String pass) {

        System.out.printf("email %s, \npass %s", email, pass);

        return target.login(email, pass);
    }

    @Override
    public int createGroup(String name) {
        return 0;
    }
}
