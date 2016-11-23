package contactlist;

/**
 * Created by Влад on 22.11.2016.
 */
public class Contact {

    private String name;
    private String email;
    private String phoneNumber;
    private static int numberOfContact = 0;
    private int id;

    public Contact(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.id = ++numberOfContact;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNumberOfContact() {
        return numberOfContact;
    }

    public static void setNumberOfContact(int numberOfContact) {
        Contact.numberOfContact = numberOfContact;
    }

    public String showInfo() {
        StringBuilder sb = new StringBuilder();

        sb.append("name is ").append(this.name).append(", ");
        sb.append("email: ").append(this.email).append(", ");
        sb.append("phoneNumber: ").append(this.phoneNumber);

        return sb.toString();
    }
}