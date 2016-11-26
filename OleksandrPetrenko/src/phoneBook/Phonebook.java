package phoneBook;

/**
 * Created by Alexandr on 26.11.2016.
 */
public class Phonebook {

    private Contact[] phonebook;

    private int freePlace = 0;

    public Phonebook(Contact[] phonebook) {
        this.phonebook = phonebook;
    }

    public Contact[] getPhonebook() {
        return phonebook;
    }

    public void setPhonebook(Contact[] phonebook) {
        this.phonebook = phonebook;
    }

    public int getFreePlace() {
        return freePlace;
    }

    public void setFreePlace(int freePlace) {
        this.freePlace = freePlace;
    }

    public Contact addContact(Contact contact){
        freePlace++;
        phonebook[freePlace] = contact.generateContact();
        return contact;

    }
    public void removeContact(){
    }




}
