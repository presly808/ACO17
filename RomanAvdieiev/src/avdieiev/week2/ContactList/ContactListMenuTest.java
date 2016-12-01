package avdieiev.week2.ContactList;

public class ContactListMenuTest {
    public static void main(String[] args) {
        ContactList cl = new ContactList();
        Contact contact1 = new Contact("John", "06311122233");
        Contact contact2 = new Contact("Mike", "09322233344");
        Contact contact3 = new Contact("Dave", "07333344455");
        Contact contact4 = new Contact("Glen", "06744455566");
        Contact contact5 = new Contact("Matt", "06355566677");
        Contact contact6 = new Contact("Rick", "09766677788");
        cl.addContact(contact1);
        cl.addContact(contact2);
        cl.addContact(contact3);
        cl.addContact(contact4);
        cl.addContact(contact5);
        cl.addContact(contact6);
        ContactListMenu clm = new ContactListMenu();
        clm.start(cl);
    }
}
