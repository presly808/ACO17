package ContactList;

public class ContactListTest {
    public static void main(String[] args) {
        ContactList list = new ContactList();
        Contact cont1 = new Contact("Richard", "0636855858");
        Contact cont2 = new Contact("Garry", "050005858");
        Contact cont3 = new Contact("Joe", "067666665858");
        Contact cont4 = new Contact("Joe1", "065hj666665858");
        Contact cont5 = new Contact("Joe2", "063666665858");
        Contact cont6 = new Contact("Richard", "065666665858");
        Contact cont7 = new Contact("Joe4", "065666665858");
        Contact cont8 = new Contact("Joe5", "093666665858");
        Contact cont9 = new Contact("Joe6", "097666665858");
        Contact cont10 = new Contact("Joe7", "0945666665858");
        Contact cont11 = new Contact("Joe8", "038666665858");


        list.addContact(cont1);
        list.addContact(cont2);
        list.addContact(cont3);
        list.addContact(cont4);
        list.addContact(cont5);
        list.addContact(cont6);
        list.addContact(cont7);
        list.addContact(cont8);
        list.addContact(cont9);
        list.addContact(cont10);
        list.addContact(cont11);

        //test add contact with validation
        int exp = 9;
        System.out.println("add contact test:" +( list.size == exp));

        //test remove last
        list.removeLast();
        int expected = 8;
        System.out.println("remove last contact test:" +( list.size == expected));

        //test find
        String find = list.find("Richard");
        System.out.println("find contact test:" +find.contains("Richard"));

       // remove contact test
        list.removeContact("Richard");
        System.out.println("remove contact test:"+(!list.asString().contains("Richard")));

        //test first 5 contacts

        System.out.println("test first 5 contacts:"+(list.showFirstFive().contains("Garry")
                                                  && !list.showFirstFive().contains("Joe7")));

        //test last 5 contacts

        System.out.println("test last 5 contacts:"+ !list.showLastFive().contains("Garry"));


        //test life contacts
        String lifeContact = list.showLife();

        System.out.println("life contact test:" +(lifeContact.contains("name Joe5 , phone 093666665858")
        && lifeContact.contains("name Joe2 , phone 063666665858")));

        //test kievstar contacts
        String kievstarContact = list.showKievstar();
        System.out.println("kievstar contact test:" +kievstarContact.contains("name Joe , phone 067666665858"));
    }
}

