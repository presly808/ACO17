package contactlist;

/**
 * Created by Влад on 22.11.2016.
 */
public class Contact {

    private String name;
    private String email;
    private String phoneNumber;

    public Contact(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String showInfo() {
        StringBuilder sb = new StringBuilder();

        sb.append("name is ").append(this.name).append(", ");
        sb.append("email: ").append(this.email).append(", ");
        sb.append("phoneNumber: ").append(this.phoneNumber);

        return sb.toString();
    }
}
