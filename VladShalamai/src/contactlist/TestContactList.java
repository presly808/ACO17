package contactlist;

/**
 * Created by Влад on 22.11.2016.
 */
public class TestContactList {

    private static final int SIZE_OF_LIST = 10;

    public static void main(String[] args) {
        ContactList list = new ContactList("Friend");

        for (int i = 0; i < SIZE_OF_LIST; i++) {
            list.getContacts()[i] = ContactUtils.generateContact(i);
        }

        testShowAllContacts(list);
    }

    public static void testShowAllContacts(ContactList list) {

        System.out.println("method showAllContacts() is " +
                (list.showAllContacts().contains("John") && list.showAllContacts().contains("Volodymyr")));
    }
}
