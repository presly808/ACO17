package contactlist;

/**
 * Created by Влад on 22.11.2016.
 */
public class TestContact {

    public static void main(String[] args) {

        Contact contact = new Contact("George", "george.@gmail.com", "095 895 34 23");

        testShowInfo(contact);

    }

    public static void testShowInfo(Contact contact) {
        String actual = contact.showInfo();
        String expected = "name is George, email: george.@gmail.com, phoneNumber: 095 895 34 23";

        System.out.printf("menthod showInfo() is %b\nactual is %s\nexpected is %s",
                expected.equals(actual), actual, expected);

    }
}
