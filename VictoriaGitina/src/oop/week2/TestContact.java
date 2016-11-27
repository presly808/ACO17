package oop.week2;

/**
 * Created by Victoria on 11/24/2016.
 */

public class TestContact {
    public static void main(String[] args) {


        Contact con1 = new Contact(1, "Vika", "0936228174");
        Contact con2 = new Contact(2, "Olia", "09662281");
        Contact con3 = new Contact(3, "valia", "0933333333");
        Contact con4 = new Contact(4, "valia", "0633333333");

        con1.setLastName("Gitina");
        con2.setLastName("Petrova");

        boolean correct1 = con1.isNumberCorrect();
        boolean correct2 = con2.isNumberCorrect();
        boolean expected1 = true;
        boolean expected2 = false;
        String message = "I compared is number correct method expected result";
        assertEqual(correct1, expected1, message);
        assertEqual(correct2, expected2, message);

        ContactList myContactList = new ContactList();

        myContactList.showAllContacts();
        myContactList.showLifeContacts();
        myContactList.showKievstarContacts();

        myContactList.addContact(con1);
        myContactList.addContact(con2);
        myContactList.addContact(con3);
        myContactList.addContact(con4);


        myContactList.showAllContacts();
        myContactList.showLifeContacts();
        myContactList.showKievstarContacts();
    }

    public static void assertEqual(String expected, String actual, String message) {
        if (expected.equals(actual)) {
            System.out.println("passed: " + message);
        } else {
            System.out.println("failed! " + "expected " + expected + "actual " + actual + message);

        }
    }


    public static void assertEqual(boolean expected, boolean actual, String message) {
        if (expected == actual) {
            System.out.println("passed: " + message);
        } else {
            System.out.println("failed! " + "expected " + expected + "actual " + actual + message);
        }
    }


}
