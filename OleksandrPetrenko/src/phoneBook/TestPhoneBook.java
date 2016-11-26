package phoneBook;

/**
 * Created by Alexandr on 26.11.2016.
 */
public class TestPhoneBook {

    public static void main(String[] args) {


        Contact contact1 = new Contact();
        Contact contact2 = new Contact();
        Contact contact3 = new Contact();

        String name = contact1.generateName();
        System.out.println(name);

        String name1 = contact2.generateName();
        String name2 = contact3.generateName();
        System.out.println(name1);
        System.out.println(name2);

        Contact cont = contact1.generateContact();
        Contact cont1 = contact2.generateContact();
        System.out.println(cont1.getName() + "; " + cont1.getPhoneNumber());
        System.out.println(cont.getName() + "; " + cont.getPhoneNumber());



        //String num = contact1.generateNumber();
        /*String num1 = contact1.generateNumber();
        String num2 = contact1.generateNumber();*/
        //System.out.print(num);




    }


}
