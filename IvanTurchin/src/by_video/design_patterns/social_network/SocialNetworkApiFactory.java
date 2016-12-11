package by_video.design_patterns.social_network;

import by_video.design_patterns.social_network.common.SocialNetworkApi;
import by_video.design_patterns.social_network.common.SocialNetworkProxy;
import by_video.design_patterns.social_network.facebook.FacebookApi;
import by_video.design_patterns.social_network.vk.VkApi;

public class SocialNetworkApiFactory {

    public static SocialNetworkApi createVk() {
        return new SocialNetworkProxy(new VkApi());
    }

    public static SocialNetworkApi createFacebook() {
        return new SocialNetworkProxy(new FacebookApi());
    }
}
