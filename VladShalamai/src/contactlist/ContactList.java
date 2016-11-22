package contactlist;

/**
 * Created by Влад on 22.11.2016.
 */
public class ContactList {

    public static final int MAX_SIZE = 20;
    private String name;
    private Contact[] contacts = new Contact[MAX_SIZE];

    public ContactList(String name) {
        this.name = name;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    public String showAllContacts() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < Contact.getNumberOfContact(); i++) {
            sb.append(contacts[i].showInfo()).append("\n");
        }

        return sb.toString();

    }

}
