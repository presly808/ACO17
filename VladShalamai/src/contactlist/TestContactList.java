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
        testShowFirstFiveContacts(list);
        testShowLastFiveContacts(list);
        testShowLifeContacts(list);
        testShowKievstarContacts(list);
    }

    public static void testShowAllContacts(ContactList list) {

        System.out.println("method showAllContacts() is " +
                        (list.showAllContacts().contains("John")
                        && list.showAllContacts().contains("Volodymyr")));
    }

    public static void testShowFirstFiveContacts(ContactList list) {

        System.out.println("method showFirstFiveContacts() is " +
                        (list.showFirstFiveContacts().contains("John")
                        && list.showFirstFiveContacts().contains("Lida")
                        && !list.showFirstFiveContacts().contains("Maks")));
    }

    public static void testShowLastFiveContacts(ContactList list) {

        System.out.println("method showLastFiveContacts() is " +
                        (list.showLastFiveContacts().contains("Maks")
                        && list.showLastFiveContacts().contains("Volodymyr")
                        && !list.showLastFiveContacts().contains("Lida")));
    }

    public static void testShowLifeContacts(ContactList list) {

        System.out.println("method showLifeContacts() is " +
                        (list.showLifeContacts().contains("093")
                        && !list.showLifeContacts().contains("095")
                        && !list.showLifeContacts().contains("097")));
    }

    public static void testShowKievstarContacts(ContactList list) {

        System.out.println("method showKievstarContacts() is " +
                        (list.showKievstarContacts().contains("097")
                        && !list.showKievstarContacts().contains("095")
                        && !list.showKievstarContacts().contains("093")));
    }


}
