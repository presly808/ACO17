package by_video.design_patterns.social_network.common;

public interface SocialNetworkApi {

    String login(String email, String pass);

    int createGroup(String name);
}
