package avdieiev.week2.ContactList;


public class ContactTest {
    public static void main(String[] args) {
        ContactList arrayOfContacts = new ContactList();
        Contact contact1 = new Contact("John", "06311122233");
        Contact contact2 = new Contact("Mike", "09322233344");
        Contact contact3 = new Contact("Dave", "07333344455");
        Contact contact4 = new Contact("Glen", "06744455566");
        Contact contact5 = new Contact("Matt", "06355566677");
        Contact contact6 = new Contact("Rick", "09766677788");
        arrayOfContacts.addContact(contact1);
        arrayOfContacts.addContact(contact2);
        arrayOfContacts.addContact(contact3);
        arrayOfContacts.addContact(contact4);
        arrayOfContacts.addContact(contact5);
        arrayOfContacts.addContact(contact6);

        /**addContact test*/
        String expected = "John";
        String actual = contact1.getName();
        System.out.println("addContact test: " + actual.equals(expected));
        /**removeLast test*/
        String expected2 = "Rick";
        arrayOfContacts.removeLast();
        String actual2 = arrayOfContacts.toString();
        System.out.println("removeLast test: " + !actual2.contains(expected2));
        /**showLifeContacts test*/
        String expected3 = "063";
        String actual3 = arrayOfContacts.showLifeContacts();
        System.out.println("showLifeContacts test: " + actual3.contains(expected3));


//        System.out.println(arrayOfContacts);

//        arrayOfContacts.removeLast();
//        System.out.println(arrayOfContacts);
//
//        String a = arrayOfContacts.findContact("Dave");
//        System.out.println(a);
//
//        arrayOfContacts.removeContact();
//        System.out.println(arrayOfContacts);
//
//        String b = arrayOfContacts.showAllContacts();
//        System.out.println(b);
//
//        System.out.println(arrayOfContacts);
//        String c = arrayOfContacts.showFirstFive();
//        System.out.println(c);
//
//        System.out.println(arrayOfContacts);
//        System.out.println("---------------------------------");
//        String d = arrayOfContacts.showLastFiveContacts();
//        System.out.println(d);

//        String e = arrayOfContacts.showLifeContacts();
//        System.out.println(e);

//        String f = arrayOfContacts.showKievstarContacts();
//        System.out.println(f);




    }
}
