package travelagency.model;

/**
 * Created by Влад on 26.11.2016.
 */
public class MyClient {

    private String name;
    private String phone;
    private String email;

    public MyClient(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

}
