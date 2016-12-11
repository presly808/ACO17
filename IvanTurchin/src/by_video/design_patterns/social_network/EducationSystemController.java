package by_video.design_patterns.social_network;

import by_video.design_patterns.social_network.common.SocialNetworkApi;

public class EducationSystemController {

    private SocialNetworkApi socialNetworkApi = SocialNetworkApiFactory.createVk();

    public int createGroup(Course course) {
        return socialNetworkApi.createGroup("name");
    }

    public String login(String email, String pass) {
        return socialNetworkApi.login(email, pass);
    }

    public Course getCourse(int id) {
        return null;
    }

    public void subscribe(Student student, int courseId) {

    }

    public SocialNetworkApi getSocialNetworkApi() {
        return socialNetworkApi;
    }

    public void setSocialNetworkApi(SocialNetworkApi socialNetworkApi) {
        this.socialNetworkApi = socialNetworkApi;
    }
}
