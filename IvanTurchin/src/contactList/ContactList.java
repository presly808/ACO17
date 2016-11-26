package contactList;

import java.util.Arrays;
import java.util.Scanner;

public class ContactList {

    private Contact[] contacts = new Contact[20];
    private int countOfContacts;
    private int lastContact = 0;

    private boolean checkUnique(String name) {
        for (int i = 0; i < this.contacts.length; i++) {
            if (this.contacts[i] != null && this.contacts[i].getName().equals(name)) {
                return true;
            }
        }

        return false;
    }

    public void addContact(Contact contact) {
        if (contact == null || checkUnique(contact.getName())) {
            return;
        }

        if (this.contacts.length == lastContact) {
            this.contacts = Arrays.copyOf(this.contacts, this.contacts.length * 2);
        }

        this.contacts[lastContact] = contact;
        lastContact++;
    }

    public void removeContact(int index) {
        if (index <= 0 || index > this.contacts.length) {
            return;
        }

        if (this.contacts[index - 1] != null) {
            this.contacts[index - 1] = null;
        }

        Contact[] temp = new Contact[this.contacts.length];
        int j = 0;

        for (int i = 0; i < this.contacts.length; i++) {
            if (this.contacts[i] != null) {
                temp[j] = this.contacts[i];
            }
            j++;
        }

        this.contacts = temp;
    }

    public Contact findContact(String key) {
        if (key == null) {
            findContact(new Scanner(System.in).next());
        }

        for (int i = 0; i < this.contacts.length; i++) {
            if (this.contacts[i] != null && this.contacts[i].getName().equals(key)) {
                return this.contacts[i];
            }
        }

        return null;
    }

    public void removeLast() {

        for (int i = this.contacts.length - 1; i >= 0; i--) {
            if (this.contacts[i] != null) {
                this.contacts[i] = null;
                this.contacts = Arrays.copyOf(this.contacts, this.contacts.length - 1);
                return;
            }
        }
    }

    public void updateInfo(String name, String phone, String email, int id, int index) {

        if (name == null || phone == null || email == null
                || index <= 0 || index > this.contacts.length || this.contacts[index - 1] == null) {
            return;
        }

        Contact contact = new Contact(name, phone, email, id);
        this.contacts[index - 1] = contact;
    }

    public String showAll() {

        String res = "";

        for (int i = 0; i < this.contacts.length; i++) {
            if (this.contacts[i] != null) {
                res += new StringBuilder(this.contacts[i].getName()).append("\n");
            }
        }

        return res;
    }

    public String showFirstFive() {

        String res = "";
        int counter = 0;

        for (int i = 0; i < this.contacts.length; i++) {
            if (this.contacts[i] != null && counter < 5) {
                res += new StringBuilder(this.contacts[i].getName()).append("\n");
                counter++;
            }
        }

        return res;
    }

    public String showLastFive() {

        String res = "";
        int counter = 0;

        for (int i = this.contacts.length - 1; i >= 0; i--) {
            if (this.contacts[i] != null && counter < 5) {
                res += new StringBuilder(this.contacts[i].getName()).append("\n");
                counter++;
            }
        }

        return res;
    }

    public String showMtcContacts() {

        String res = "";

        for (int i = 0; i < this.contacts.length; i++) {
            if (this.contacts[i] != null && this.contacts[i].getOperator().equals("Vodafone")) {
                res += new StringBuilder(this.contacts[i].getName()).append("\n");
            }
        }

        return res;
    }

    public String showKyivstarContacts() {

        String res = "";

        for (int i = 0; i < this.contacts.length; i++) {
            if (this.contacts[i] != null && this.contacts[i].getOperator().equals("Kyivstar")) {
                res += new StringBuilder(this.contacts[i].getName()).append("\n");
            }
        }

        return res;
    }

    @Override
    public String toString() {
        return "ContactList{" +
                "contacts=" + Arrays.toString(contacts) +
                ", countOfContacts=" + countOfContacts +
                ", lastContact=" + lastContact +
                '}';
    }

    public Contact[] getContacts() {
        return contacts;
    }
}
