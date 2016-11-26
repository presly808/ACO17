package travelagency;

/**
 * Created by Влад on 26.11.2016.
 */
public class Request {

    private String name;
    private String phone;
    private String email;
    private MyDate date;

    public Request(String name, String phone, String email, MyDate date) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MyDate getDate() {
        return date;
    }

    public void setDate(MyDate date) {
        this.date = date;
    }
}
