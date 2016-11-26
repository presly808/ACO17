package contactlist;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Влад on 22.11.2016.
 */
public class ContactList {

    public static final int MAX_SIZE = 20;
    private String name;
    private Contact[] contacts = new Contact[MAX_SIZE];
    private int numberOfContact;

    public ContactList(String name) {
        this.name = name;
    }

    public int getNumberOfContact() {
        return numberOfContact;
    }

    public void setNumberOfContact(int numberOfContact) {
        this.numberOfContact = numberOfContact;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public String showAllContacts() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numberOfContact; i++) {

            sb.append(contacts[i].showInfo()).append("\n");

        }

        return sb.toString();

    }

    public String showFirstFiveContacts() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5 && i < numberOfContact; i++) {

            sb.append(contacts[i].showInfo()).append("\n");

        }

        return sb.toString();
    }

    public String showLastFiveContacts() {

        StringBuilder sb = new StringBuilder();

        for (int i = numberOfContact - 1; i >= 0 && i > numberOfContact - 6; i--) {

            sb.append(contacts[i].showInfo()).append("\n");

        }

        return sb.toString();
    }

    public String showLifeContacts() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numberOfContact; i++) {
            if (contacts[i].getPhoneNumber().substring(0, 3).equals("093")) {
                sb.append(contacts[i].showInfo()).append("\n");
            }
        }

        return sb.toString();
    }

    public String showKievstarContacts() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numberOfContact; i++) {
            if (contacts[i].getPhoneNumber().substring(0, 3).equals("097")) {
                sb.append(contacts[i].showInfo()).append("\n");
            }
        }

        return sb.toString();
    }


    public void addContact(String name, String email, String phoneNumber) {
        // check for correct name
        Pattern pattern = Pattern.compile("[^a-zA-Z]");
        Matcher matcher = pattern.matcher(name);

        if (matcher.find()) {
            System.out.println("Incorrect name");
            return;
        }

        // check for uniqueness
        for (int i = 0; i < numberOfContact; i++) {
            if (contacts[i].getName().equals(name)) {
                System.out.println("this name already exists");
            }
        }

        // check for places
        if (numberOfContact == MAX_SIZE) {
            System.out.println("Sorry, not enough memory(");
        }
        contacts[numberOfContact] = new Contact(name, email, phoneNumber);
        numberOfContact++;

    }

    public void removeContact(String name) {

        int i;
        for (i = 0; i < numberOfContact; i++) {
            if (name.equals(contacts[i].getName())) {
                contacts[i] = null;
                break;
            }
        }

        for (int j = i; j < numberOfContact - 1; j++) {
            contacts[j] = contacts[j + 1];
        }

        contacts[numberOfContact - 1] = null;
        numberOfContact--;
    }

    public void removeLast() {
        if (numberOfContact != 0) {
            contacts[numberOfContact - 1] = null;
            numberOfContact--;
        }
    }

    public String findContact(String name) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numberOfContact; i++) {
            if (contacts[i].getName().equals(name)) {
                sb.append(contacts[i].showInfo());
                return sb.toString();
            }
        }

        return "contact does not exist";

    }

    public void updateContactInfo(String name, String email, String phoneNumber) {

        for (int i = 0; i < numberOfContact; i++) {
            if (contacts[i].getName().equals(name)) {

                contacts[i].setEmail(email);
                contacts[i].setPhoneNumber(phoneNumber);
                return;
            }
        }

        System.out.println("contact does not exist");
    }
}
