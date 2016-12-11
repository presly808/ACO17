package by_video.design_patterns.social_network.twitter;

import by_video.design_patterns.social_network.common.SocialNetworkApi;

public class TwitterSocialNetworkAdapter implements SocialNetworkApi{

    private TwitterApi twitterApi;

    public TwitterSocialNetworkAdapter(TwitterApi twitterApi) {
        this.twitterApi = twitterApi;
    }

    @Override
    public String login(String email, String pass) {
        return null;
    }

    @Override
    public int createGroup(String name) {

        String post = twitterApi.createPost(name);

        return Integer.parseInt(post.split("=")[1]);
    }
}
