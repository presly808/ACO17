package week3.ContactList;
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

public class ContactList {
    Contact[] contactsList = new Contact[10];
    int size = 0;

    public void addContact(Contact contact) {
        contactsList[size] = contact;
        size++;
    }

    public void removeLast() {
        for (int i = contactsList.length - 1; i >= 0; i--) {

            if (contactsList[i] != null) {
                contactsList[i] = null;
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
        for (int i = 0; i < contactsList.length; i++) {
            if (name == contactsList[i].getName() && name != null) {
                result += contactsList[i].showInfo() + "\n";
                break;
            }
        }

        return result;
    }

    public void removeContact(String name) {

        for (int i = 0; i < contactsList.length; i++) {
            if (name == contactsList[i].getName() && name != "") {
                contactsList[i] = null;
                break;
            }
        }
    }

    public String showAll() {
        String strCars = "";
        for (int i = 0; i < contactsList.length; i++) {
            Contact index = contactsList[i];
            if (index != null) {
                strCars += index.showInfo() + "\n";
            }
        }
        return strCars;
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
                result += contactsList[i].showInfo()+"\n";
                count++;

                if (count == 6) {
                    break;
                }
            }
        }
        return result;
    }

}
