package by_video.design_patterns.social_network.tests;

import by_video.design_patterns.social_network.EducationSystemController;
import by_video.design_patterns.social_network.facebook.FacebookApi;

public class TestStrategy {

    public static void main(String[] args) {

        EducationSystemController educationSystemController = new EducationSystemController();

        educationSystemController.setSocialNetworkApi(new FacebookApi());
        String res = educationSystemController.login("email", "23452345");
        System.out.println(res);

        educationSystemController.setSocialNetworkApi(null);
        String res1 = educationSystemController.login("email", "23452345");
        System.out.println(res1);
    }
}
