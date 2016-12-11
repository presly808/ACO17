package by_video.design_patterns.social_network.tests;

import by_video.design_patterns.social_network.EducationSystemController;

public class TestProxy {

    public static void main(String[] args) {

        EducationSystemController controller = new EducationSystemController();

        String res = controller.login("1", "2");
        System.out.println(res);
    }
}
