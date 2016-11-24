package avdieiev.week2.ContactList;

import java.util.Arrays;
import java.util.Scanner;

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

    int i = 0;

    public void addContact(Contact contact) {
        arrContacts[i] = contact;
        i++;
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
            if (SearchedContact.equals(arrContacts[i].getName())) {
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
        String strContacts = null;
        for (int i = 0; i < arrContacts.length; i++) {
            strContacts += arrContacts[i];
            System.out.println(strContacts);
            if (i >= 4) {
                break;
            }
        }
        return strContacts;
    }


    public String showLastFiveContacts() {
        String strContacts = null;
        for (int i = arrContacts.length - 1; i >= 0; i--) {
            strContacts += arrContacts[i];
            System.out.println(strContacts);
            if (i <= arrContacts.length - 5) {
                break;
            }
        }
        return strContacts;
    }

    @Override
    public String toString() {
        return "ContactList{" +
                "arrContacts=" + Arrays.toString(arrContacts) +
                '}';
    }
}
