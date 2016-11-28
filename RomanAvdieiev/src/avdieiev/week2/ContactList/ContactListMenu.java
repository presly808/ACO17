package avdieiev.week2.ContactList;

import java.util.Scanner;

public class ContactListMenu {
    private Scanner scanner = new Scanner(System.in);
    private ContactList contactList;

    public void startContactlist(ContactList contactList) {
        this.contactList = contactList;
    }

    public void start() {
        while (true) {
            showMainMenu();
            int choice = scanner.nextInt();
            if (choice == 1) {
                showAddContactMenu();
            } else if (choice == 2) {
                showRemoveContact();
            } else if (choice == 3) {
                showRemoveContact();
            } else if (choice == 4) {
                showFirstFiveContact();
            } else if (choice == 5) {
                showLastFiveContact();
            } else if (choice == 6) {
                contactList.showAllContacts();
            } else if (choice == 7) {
                showFindContact();
            } else if (choice == 8) {
                contactList.showLifeContacts();
            } else if (choice == 9) {
                contactList.showKievstarContacts();
            } else if (choice == 10) {
                break;
            }
        }
    }

    private void showAddContactMenu() {
        System.out.println("Input name");
        String name = scanner.next();
        System.out.println("Input number");
        String number = scanner.next();

        Contact contact = new Contact(name, number);
        contactList.addContact(contact);
    }

    private void showRemoveLastContact() {
        contactList.removeLast();
    }

    private void showRemoveContact() {
        contactList.removeContact();
    }

    private void showFirstFiveContact() {
        contactList.showFirstFive();
    }

    private void showLastFiveContact() {
        contactList.showLastFiveContacts();
    }

    private void showFindContact() {
        System.out.println("Input name");
        String name = scanner.next();
        contactList.findContact(name);
    }


    public void showMainMenu() {
        System.out.println("1. Add contact");
        System.out.println("2. Remove Last Contact");
        System.out.println("3. Remove Contact");
        System.out.println("4. Show First Five Contacts");
        System.out.println("5. Show Last Five Contacts");
        System.out.println("6. Show All Contacts");
        System.out.println("7. Find Contact");
        System.out.println("8. Show Life Contacts");
        System.out.println("9. Show Kievstar Contacts");
        System.out.println("10. Exit");
    }
}