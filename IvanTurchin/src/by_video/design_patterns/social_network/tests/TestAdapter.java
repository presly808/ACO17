package by_video.design_patterns.social_network.tests;

import by_video.design_patterns.social_network.Course;
import by_video.design_patterns.social_network.EducationSystemController;
import by_video.design_patterns.social_network.twitter.TwitterApi;
import by_video.design_patterns.social_network.twitter.TwitterSocialNetworkAdapter;

public class TestAdapter {

    public static void main(String[] args) {

        EducationSystemController educationSystemController = new EducationSystemController();
        educationSystemController.setSocialNetworkApi(new TwitterSocialNetworkAdapter(new TwitterApi()));

        int res = educationSystemController.createGroup(new Course());
        System.out.println(res);
    }
}
