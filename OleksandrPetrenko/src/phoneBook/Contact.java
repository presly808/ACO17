package phoneBook;

/**
 * Created by Alexandr on 26.11.2016.
 */
public class Contact {

    private String name;
    private String phoneNumber;

    private int idContact;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contact() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getIdContact() {
        return idContact;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }

    public String generateName(){
        String[] names = {"Jack", "James", "Kikrk", "Ozzy", "Lemmy"};
        return names[(int)(Math.random() * names.length)];
    }

    public String generateNumber(){
        String num = "093";
        for (int i = 1; i < 8; i++) {
            num = num + (int)(Math.random() * 10);
        }
        return num;
    }

    public Contact generateContact(){
        Contact contact = new Contact(generateName(), generateNumber());
        return contact;
    }

}
