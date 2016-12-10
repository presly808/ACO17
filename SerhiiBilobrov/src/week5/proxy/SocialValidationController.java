package week5.proxy;

/**
 * Created by serhii on 12/10/16.
 */
public class SocialValidationController implements SocialController {

    private SocialController target;

    public SocialValidationController(SocialController target) {
        this.target = target;
    }

    @Override
    public String signUp(String email, String pass) {

        if( !email.contains("@") || pass.length() < 8){
            return "invalid data";
        } else {
            return target.signUp(email,pass);
        }


    }
}
