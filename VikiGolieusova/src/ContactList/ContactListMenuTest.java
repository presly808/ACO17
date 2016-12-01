package ContactList;

public class ContactListMenuTest {
    public static void main(String[] args) {
        ContactList contactList = new ContactList();

        Contact cont1 = new Contact("Richard", "0656855858");
        contactList.addContact(cont1);
        Contact cont2 = new Contact("Garry", "050005858");
        Contact cont3 = new Contact("Joe", "067666665858");
        Contact cont5 = new Contact("Joe2", "063666665858");
        Contact cont7 = new Contact("Joe4", "065666665858");
        Contact cont4 = new Contact("Joe3", "065566665858");

        contactList.addContact(cont2);
        contactList.addContact(cont3);
        contactList.addContact(cont5);
        contactList.addContact(cont7);
        contactList.addContact(cont4);

        ContactListMenu menu = new ContactListMenu();
        menu.start(contactList);
    }
}
