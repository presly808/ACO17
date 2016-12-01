package ContactList;
/*      - addContact
        - removeLast
        - findContact
        - removeContact

        -*updateContactInfo

        - showAllContacts

        - showFirstFiveContacts
        - showLastFiveContacts

        - showLifeContacts
        - showKievstarContacts
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactList {
    Contact[] contactsList = new Contact[10];
   public int size = 0;



    public void addContact(Contact contact) {

        if (size > 0) {
            for (int i = 0; i < size; i++) {
                if (contact.getName().equals(contactsList[i].getName())) {
                    System.err.println("this data was used. Please change name");
                    return;
                }
            }
        }
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(contact.getPhone());

        if (matcher.find()) {
            System.err.println("Incorrect number");
            return;
        }
        contactsList[size] = contact;
        size++;
    }

    public void removeLast() {
        for (int i = contactsList.length - 1; i >= 0; i--) {

            if (contactsList[i] != null) {
                contactsList[i] = null;
                size--;
                break;
            }

        }
    }

    public String asString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            if (contactsList[i] != null) {
                Contact current = contactsList[i];
                result += "name: " + current.getName() + ", phone: " + current.getPhone() + "\n";
            }
        }
        return result;
    }

    public String find(String name) {
        String result = "";

        for (int i = 0; i < size; i++) {
            if (name == contactsList[i].getName() && name != null) {
                result += contactsList[i].showInfo() + "\n";
                break;
            }
        }
        return result;
    }

    public void removeContact(String name) {

        for (int i = 0; i < size; i++) {
            if (name == contactsList[i].getName() && name != "") {
                contactsList[i] = null;
                size--;
                break;
            }
        }
    }

    public String showAll() {
        String strContact = "";
        for (int i = 0; i < contactsList.length; i++) {
            Contact index = contactsList[i];
            if (index != null) {
                strContact += index.showInfo() + "\n";
            }
        }
        return strContact;
    }

    public String showFirstFive() {
        String result = "";
        int count = 1;
        for (int i = 0; i < contactsList.length; i++) {
            if (contactsList[i] != null) {
                result += contactsList[i].showInfo() + "\n";
                count++;
                if (count == 6) {
                    break;
                }
            }
        }
        return result;
    }

    public String showLastFive() {
        String result = "";
        int count = 1;
        for (int i = contactsList.length - 1; i >= 0; i--) {
            if (contactsList[i] != null) {
                result += contactsList[i].showInfo() + "\n";
                count++;

                if (count == 6) {
                    break;
                }
            }
        }
        return result;
    }

    public String showLife() {
        String life = "";
        for (int i = 0; i < contactsList.length; i++) {
            if (contactsList[i] != null && (contactsList[i].getPhone().startsWith("063")
                                         || contactsList[i].getPhone().startsWith("093"))) {
                life += contactsList[i].showInfo() + "\n";
            }
        }
        return life;
    }

    public String showKievstar() {
        String kievstar = "";
        for (int i = 0; i < contactsList.length; i++) {
            if (contactsList[i] != null && (contactsList[i].getPhone().startsWith("067")
                                         || contactsList[i].getPhone().startsWith("097"))) {
                kievstar += contactsList[i].showInfo() + "\n";
            }
        }
        return kievstar;
    }
}
