package avdieiev.week2.ContactList;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1. ContactList Application (3 hours)
 * - addContact
 * - removeLast
 * - findContact
 * - removeContact
 * -*updateContactInfo
 * - showAllContacts
 * - showFirstFiveContacts
 * - showLastFiveContacts
 * - showLifeContacts
 * - showKievstarContacts
 * (name must be unique in contact list)
 * before adding do validation
 * user can put wrong info like that
 * 7sdf463dfg276
 * before saving check all symbols
 */
public class ContactList {

    Contact[] arrContacts = new Contact[10];

    int j = 0;

    public void addContact(Contact contact) {
        Pattern p = Pattern.compile("[a-z]");
        Matcher m = p.matcher(contact.getNumber());
        if (m.find()){
            System.out.println("This field must contain only numerals");
            return;
        }

        for (int i = 0; i < j; i++) {
            if (arrContacts[i].getName().equals(contact.getName())) {
                System.out.println("Such name already exists!");
            }
        }
        arrContacts[j] = contact;
        j++;
    }

    public void removeLast() {
        for (int i = arrContacts.length - 1; i >= 0; i--) {
            if (arrContacts[i] != null) {
                arrContacts[i] = null;
                break;
            }
        }
    }

    public String findContact(String name) {
        String searchedContact = "";
        for (int i = 0; i < arrContacts.length; i++) {
            if (name.equals(arrContacts[i].getName()) && arrContacts[i] != null) {
                searchedContact += arrContacts[i].showInfo();
                break;
            }
        }
        return searchedContact;
    }

    public void removeContact() {
        System.out.println("Print searched name below");
        Scanner sc = new Scanner(System.in);
        String SearchedContact = sc.next();
        for (int i = 0; i < arrContacts.length; i++) {
            if (arrContacts[i] != null && SearchedContact.equals(arrContacts[i].getName())) {
                arrContacts[i] = null;
            } else {
                System.out.println("Name not found");
            }
        }
    }

    public String showAllContacts() {
        String strContacts = "";
        for (int i = 0; i < arrContacts.length; i++) {
            Contact contact = arrContacts[i];
            if (contact != null) {
                strContacts += contact.showInfo() + "\n";
            }
        }
        return strContacts;
    }

    public String showFirstFive() {
        String strContacts = "";
        for (int i = 0; i < arrContacts.length; i++) {
            strContacts += arrContacts[i];
            if (i >= 4) {
                break;
            } else if (arrContacts[i] == null) {
                continue;
            }
        }
        return strContacts;
    }

    public String showLastFiveContacts() {
        String strContacts = "";
        int count = 0;
        for (int i = arrContacts.length - 1; i >= 0; i--) {
            if (arrContacts[i] != null) {
                strContacts += arrContacts[i];
                count = count + 1;
            }
            if (count == 5) {
                break;
            }
        }
        return strContacts;
    }

    public String showLifeContacts() {
        String lifeContact = "";
        for (int i = 0; i < arrContacts.length; i++) {
            if (arrContacts[i] != null &&
               (arrContacts[i].getNumber().startsWith("063") ||
                arrContacts[i].getNumber().startsWith("093") ||
                arrContacts[i].getNumber().startsWith("073"))) {
                lifeContact += arrContacts[i].showInfo();
            }
        }
        return lifeContact;
    }

    public String showKievstarContacts() {
        String kievstarContact = "";
        for (int i = 0; i < arrContacts.length; i++) {
            if (arrContacts[i] != null &&
               (arrContacts[i].getNumber().startsWith("067") ||
                arrContacts[i].getNumber().startsWith("097"))) {
                kievstarContact = kievstarContact + arrContacts[i].showInfo();
            }
        }
        return kievstarContact;
    }

    @Override
    public String toString() {
        return "ContactList{" +
                "arrContacts=" + Arrays.toString(arrContacts) +
                '}';
    }
}
