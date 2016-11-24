package contactList.test;

import contactList.Contact;
import contactList.ContactList;

public class TestContactList {
    public static void main(String[] args) {

        System.out.println("testAddContact() --> " + testAddContact() +
                           "\ntestRemoveContact() --> " + testRemoveContact() +
                           "\ntestFindContact() --> " + testFindContact() +
                           "\ntestRemoveLastContact() --> " + testRemoveLastContact() +
                           "\ntestUpdateInfo() --> " + testUpdateInfo() +
                           "\ntestShowAll() --> " + testShowAll() +
                           "\ntestFirstFive() --> " + testFirstFive() +
                           "\ntestShowLastFive() --> " + testShowLastFive() +
                           "\ntestShowMtcContacts() --> " + testShowMtcContacts() +
                           "\ntestShowKyivstarContacts() --> " + testShowKyivStarContacts());
    }

    private static boolean testAddContact() {
        ContactList contactList = new ContactList();

        Contact contact = new Contact("Max", "+3809534490234", "max9122@gmail.com", 1);
        contactList.addContact(contact);

        return contactList.getContacts()[0] == contact;
    }

    private static boolean testRemoveContact() {
        ContactList contactList = new ContactList();
        Contact contact = new Contact("Max", "+3809534490234", "max9122@gmail.com", 1);
        contactList.addContact(contact);

        contactList.removeContact(1);

        return contactList.getContacts()[0] == null;
    }

    private static boolean testFindContact() {
        ContactList contactList = new ContactList();
        Contact contact = new Contact("Max", "+3809534490234", "max9122@gmail.com", 1);
        contactList.addContact(contact);

        Contact found = contactList.findContact("Max");

        return found.equals(contact);
    }

    private static boolean testRemoveLastContact() {
        ContactList contactList = new ContactList();
        Contact contact = new Contact("Max", "+3809534490234", "max9122@gmail.com", 1);
        contactList.addContact(contact);

        contactList.removeLast();

        return contactList.getContacts()[0] == null;
    }

    private static boolean testUpdateInfo() {
        ContactList contactList = new ContactList();
        Contact contact = new Contact("Max", "+3809534490234", "max9122@gmail.com", 1);
        contactList.addContact(contact);

        contactList.updateInfo("Bogdan", "+380672348713", "bogdan95@gmail.com", 1, 1);
        Contact update = contactList.getContacts()[0];

        return update.getName().equals("Bogdan") && update.getPhone().equals("+380672348713") &&
                update.getEmail().equals("bogdan95@gmail.com");
    }

    private static boolean testShowAll() {
        ContactList contactList = new ContactList();
        Contact contact = new Contact("Max", "+3809534490234", "max9122@gmail.com", 1);
        Contact contact1 = new Contact("Bogdan", "+380672348713", "bogdan95@gmail.com", 2);
        contactList.addContact(contact);
        contactList.addContact(contact1);

        String all = contactList.showAll();

        return all.contains(contact.getName()) && all.contains(contact1.getName());
    }

    private static boolean testFirstFive() {
        ContactList contactList = new ContactList();

        for (int i = 0; i < 6; i++) {
            contactList.addContact(new Contact("n" + i, "p" + i, "e" + i, i));
        }

        String res = contactList.showFirstFive();

        for (int i = 0; i < 5; i++) {
            if (!res.contains("n" + i)) {
                return false;
            }
        }

        return true;
    }

    private static boolean testShowLastFive() {
        ContactList contactList = new ContactList();

        for (int i = 0; i < 6; i++) {
            contactList.addContact(new Contact("n" + i, "p" + i, "e" + i, i));
        }

        String res = contactList.showLastFive();

        return res.contains("n1") && res.contains("n2") && res.contains("n3")
                && res.contains("n4") && res.contains("n5");
    }

    private static boolean testShowMtcContacts() {
        ContactList contactList = new ContactList();
        contactList.addContact(new Contact("1", "0952632323", "1", 1));
        contactList.addContact(new Contact("2" , "0672343451", "2", 2));
        contactList.addContact(new Contact("3", "380958754321", "3", 3));

        String res = contactList.showMtcContacts();

        return res.contains("1") && res.contains("3");
    }

    private static boolean testShowKyivStarContacts() {
        ContactList contactList = new ContactList();
        contactList.addContact(new Contact("1", "0952632323", "1", 1));
        contactList.addContact(new Contact("2" , "0672343451", "2", 2));
        contactList.addContact(new Contact("3", "380958754321", "3", 3));

        return contactList.showKyivstarContacts().contains("2");
    }
}
