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

        for (int i = 0; i < MAX_SIZE; i++) {
            if (contacts[i] != null) {
                sb.append(contacts[i].showInfo()).append("\n");
            }
        }

        return sb.toString();

    }

    public String showFirstFiveContacts() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            if (contacts[i] != null) {
                sb.append(contacts[i].showInfo()).append("\n");
            }
        }

        return sb.toString();
    }

    public String showLastFiveContacts() {

        StringBuilder sb = new StringBuilder();

        for (int i = Contact.getNumberOfContact() - 5; i < MAX_SIZE; i++) {
            if (contacts[i] != null) {
                sb.append(contacts[i].showInfo()).append("\n");
            }
        }

        return sb.toString();
    }

    public String showLifeContacts() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < MAX_SIZE; i++) {
            if (contacts[i] != null && contacts[i].getPhoneNumber().substring(0, 3).equals("093")) {
                sb.append(contacts[i].showInfo()).append("\n");
            }
        }

        return sb.toString();
    }

    public String showKievstarContacts() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < MAX_SIZE; i++) {
            if (contacts[i] != null && contacts[i].getPhoneNumber().substring(0, 3).equals("097")) {
                sb.append(contacts[i].showInfo()).append("\n");
            }
        }

        return sb.toString();
    }


}
