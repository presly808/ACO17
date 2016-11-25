package avdieiev.week2.ContactList;

public class Contact {

    private String name;
    private String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String showInfo() {
        return String.format("name %s, number %s", name, number);
    }


    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return '\n' + "Contact{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}' + '\n';
    }
}
