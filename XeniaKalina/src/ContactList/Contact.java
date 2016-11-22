package ContactList;

/**
 * Created by User on 22.11.2016.
 */
public class Contact {
    private String name;
    private String number;

    public Contact() {
    }


    public Contact(String name, String number) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = this.name;
    }

    public String getNumber() {
        return number;
    }

    public Contact randomContact() {
        Contact result = new Contact();
        String[] names = {"Agafon", "Arisatrh", "Alesha", "Anastasia", "Avdotia", "Annushka", "Anatolij",
                "Barbara", "Bronislav", "Boris", "Bob", "Vladimir", "Valya", "Vsevolod", "Venechka", "Vicka",
                "Gavriil", "Galya", "Gena", "Gunara", "Ganopold", "Grisha", "Gertruda", "Gjulnara",};
        result.name = names[(int) (Math.random() * 24)];

        String lifeStart = "+38063";
        for (int i = 0; i < 7; i++) {
            lifeStart += (int) (Math.random() * 10);
            i++;
        }
        result.number = lifeStart;
        return result;
    }
}
