package oop.week2;

import oop.week2.Contact;

/**
 * Created by Victoria on 11/25/2016.
 * +  addContact
 * - removeLast
 * - findContact
 * - removeContact
 * updateContactInfo
 * +  showAllContacts
 * - showFirstFiveContacts
 * - showLastFiveContacts
 * +  showLifeContacts
 * + -showKievstarContacts
 */
public class ContactList {

    Contact[] contacts = new Contact[10];
    private int index = 0;


    public void showAllContacts() {
        System.out.println("All contacts:");
        int count = 0;
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                continue;// no need else because we have continue without extra condition
            }
            count++;
            contacts[i].showContact();
        }
        if (count == 0) {
            System.out.println("Empty Contact List");
        } else {
            System.out.println("total count: " + count);
        }
        System.out.println();
    }

    public void showAllContactsForTest() {
        for (int i = 0; i < contacts.length; i++) {
            if (!(contacts[i] == null)) {
                contacts[i].showContact();
            } else {
                System.out.println("empty contact");
            }
        }
    }

    public void showLifeContacts() {
        int countLife = 0;
        System.out.println("All Life contacts:");
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                continue;
            }
            if (contacts[i].getProvider().equals("Life:)")) {
                contacts[i].showLifeContacts();
                countLife++;
            }
        }
        if (countLife > 0) {
            System.out.println("Number of Life Contacts is: " + countLife);
        } else if (countLife == 0) {
            System.out.println("NO Life contacts");
        }
        System.out.println();
    }

    public void showKievstarContacts() {
        int countKievstar = 0;
        System.out.println("All Kievstar contacts:");
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                continue;
            }
            if (contacts[i].getProvider().equals("Kievstar")) {
                contacts[i].showKievstarContacts();
                countKievstar++;
            }
        }
        if (countKievstar > 0) {
            System.out.println("Number of Kievstar Contacts is: " + countKievstar);
        } else if (countKievstar == 0) {
            System.out.println("NO Kievstar contacts");
        }
        System.out.println();
    }

    public void addContact(Contact con1) {
        contacts[index] = con1;
        System.out.println("Contact " + con1.getName() + " placed at index " + index);
        index++;
    }

}
