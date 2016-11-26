package ContactList;

public class ContactListTest {
    public static void main(String[] args) {
        ContactList list = new ContactList();
        Contact cont1 = new Contact("Richard", "0656855858");
        Contact cont2 = new Contact("Garry", "050005858");
        Contact cont3 = new Contact("Joe", "065666665858");
        Contact cont4 = new Contact("Joe1", "065666665858");
        Contact cont5 = new Contact("Joe2", "065666665858");
        Contact cont6 = new Contact("Joe3", "065666665858");
        Contact cont7 = new Contact("Joe4", "065666665858");
        Contact cont8 = new Contact("Joe5", "065666665858");
        Contact cont9 = new Contact("Joe6", "065666665858");

        list.addContact(cont1);
        list.addContact(cont2);
        list.addContact(cont3);
        list.addContact(cont4);
        list.addContact(cont5);
        list.addContact(cont6);
        list.addContact(cont7);

        System.out.println(list.asString());


        list.removeLast();
        System.out.println(list.asString());

        String s = list.find("Richard");
        System.out.println(s);

        list.removeContact("Richard");
        System.out.println((list.asString()));

        list.addContact(cont8);
        list.addContact(cont9);

        String show = list.showAll();
        System.out.println(show);



        String showFF = list.showFirstFive();
        System.out.println(showFF);

        String showLF = list.showLastFive();
        System.out.println(showLF);
    }
}

