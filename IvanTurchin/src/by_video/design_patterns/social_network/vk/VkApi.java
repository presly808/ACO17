package by_video.design_patterns.social_network.vk;

import by_video.design_patterns.social_network.common.SocialNetworkApi;

public class VkApi implements SocialNetworkApi{

    public String login(String email, String pass) {
        return "vk key";
    }

    public int createGroup(String name) {
        System.out.println("IVkUser group " + name);
        return 1;
    }

    public VkGroup get(int id) {
        return new VkGroup();
    }
}
