package ContactList;

import java.util.Scanner;

public class ContactListMenu {
    private Scanner scanner = new Scanner(System.in);
    private ContactList contactList;

    public void start(ContactList contactList) {
        this.contactList = contactList;
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            if (choice == 1) {
                showAddContactMenu();
            } else if (choice == 2) {
                showRemoveContactMenu();
            } else if (choice == 3) {
                showFindContactMenu();
            } else if (choice == 4) {
                showRemoveLast();
            } else if (choice == 5) {
                showAllContacts();
            } else if (choice == 6) {
                showFirstFive();
            } else if (choice == 7) {
                showLastFive();
            } else if (choice == 8) {
                ShowLifeContacts();
            } else if (choice == 9) {
                ShowKievstarContacts();
            } else if (choice == 0) {
                break;
            }
        }
    }

    private void ShowLifeContacts() {
        String life = contactList.showLife();
        System.out.println(life);
    }

    private void ShowKievstarContacts() {
        String kievstar = contactList.showKievstar();
        System.out.println(kievstar);
    }

    private void showLastFive() {
        String fiveLast = contactList.showLastFive();
        System.out.println(fiveLast);
    }

    private void showFirstFive() {
        String fiveContacts = contactList.showFirstFive();
        System.out.println(fiveContacts);
    }

    private void showRemoveLast() {
        contactList.removeLast();
        System.out.println("Last contact removed");
    }

    private void showAllContacts() {
        System.out.println(contactList.asString());
    }

    private void showFindContactMenu() {
        System.out.println("Input name:");
        String name = scanner.next();
        String found = contactList.find(name);
        System.out.println(found);
    }

    private void showRemoveContactMenu() {
        System.out.println("Input name:");
        String name = scanner.next();
        contactList.removeContact(name);
        System.out.println("Contact " + name + " was deleted");
    }

    private void showMenu() {
        System.out.println("1. add contact");
        System.out.println("2. remove contact");
        System.out.println("3. find contact");
        System.out.println("4. remove last contact");
        System.out.println("5. show all contacts");
        System.out.println("6. show first 5 contacts");
        System.out.println("7. show last 5 contacts");
        System.out.println("8. show Life contacts");
        System.out.println("9. show Kyivstar contacts");
        System.out.println("0. Exit");
    }

    private void showAddContactMenu() {
        System.out.println("Input name:");
        String name = scanner.next();
        System.out.println("Input phone:");
        String phone = scanner.next();
        Contact contact = new Contact(name, phone);
        contactList.addContact(contact);
    }
}
