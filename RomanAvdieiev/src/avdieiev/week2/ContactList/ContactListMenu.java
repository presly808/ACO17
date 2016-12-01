package avdieiev.week2.ContactList;

import java.util.Scanner;

public class ContactListMenu {
    private Scanner scanner = new Scanner(System.in);
    private ContactList contactList;

    public void start(ContactList contactList) {
        this.contactList = contactList;
        while (true) {
            showMainMenu();
            int choice = scanner.nextInt();
            if (choice == 1) {
                showAddContactMenu();
            } else if (choice == 2) {
                showRemoveLastContact();
            } else if (choice == 3) {
                showRemoveContact();
            } else if (choice == 4) {
                showFirstFiveContact();
            } else if (choice == 5) {
                showLastFiveContact();
            } else if (choice == 6) {
                showShowAllContacts();
            } else if (choice == 7) {
                showFindContact();
            } else if (choice == 8) {
                showShowLifeContacts();
            } else if (choice == 9) {
                showShowKievstarContacts();
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

    private void showShowKievstarContacts(){
        String s1 = contactList.showKievstarContacts();
        System.out.println(s1);
    }

    private void showShowLifeContacts (){
        String s2 = contactList.showLifeContacts();
        System.out.println(s2);
    }

    private void showShowAllContacts () {
        String s3 = contactList.showAllContacts();
        System.out.println(s3);
    }

    private void showRemoveLastContact() {
        contactList.removeLast();
        System.out.println("You have removed last contact");
    }

    private void showRemoveContact() {
        contactList.removeContact();
        System.out.println("You have removed contact");
    }

    private void showFirstFiveContact() {
        String s5 = contactList.showFirstFive();
        System.out.println(s5);
    }

    private void showLastFiveContact() {
        String s6 = contactList.showLastFiveContacts();
        System.out.println(s6);
    }

    private void showFindContact() {
        System.out.println("Input name");
        String name = scanner.next();
        String s7 = contactList.findContact(name);
        System.out.println(s7);
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