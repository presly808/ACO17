package oop.week2;

/**
 * Created by Victoria on 11/24/2016.
 */
public class Contact {

    private String name;
    private String lastName;
    private String number;
    private String provider;
    private static int globalID = 0;
    private int id;
    public Contact(int id, String name, String number) {
        this.id = globalID;
        globalID++;
        this.name = name;
        this.number = number;
    }

    public boolean isNumberCorrect() {
        if (number == null || number.length() != 10) {
            System.out.println("Wrong input number: " + number);
            return false;
        } else if (number.substring(0, 3).equals("063") || number.substring(0, 3).equals("096") ||
                number.substring(0, 3).equals("093")) {
            return true;
        }
        return false;
    }

    public void showContact() {
             System.out.println(String.format("name %s, lastName %s, number %s, provider %s, globalID %d",
                name, lastName, number, provider, globalID));
    }


    public String showLifeContacts() {
        if (provider.equals("Life:)")) {
            return String.format("name %s, lastName %s, number %s, provider %s, globalID %d",
                    name, lastName, number, provider, globalID);
        } else {
            return null;
        }

    }

    public String showKievstarContacts() {//is life boolean
        if (provider.equals("Kievstar")) {
            return String.format("name %s, lastName %s, number %s, provider %s",
                    name, lastName, number, provider);
        } else {
            return null;
        }
    }

    public String showFirstFiveContacts() {//do we need array here??

        if (id <= 5) {
            return String.format("name %s, lastName %s, number %s, provider %s, globalID %d",
                    name, lastName, number, provider, globalID);
        } else {
            return null;
        }
    }

    private void setProvider() {
        String life = "063";
        String kievstar = "096";

        if (number.substring(0, 3).equals(life)) {
            this.provider = "Life:)";
        } else if (number.substring(0, 3).equals(kievstar)) {
            this.provider = "Kievstar";
        } else if(number == null) {
            this.provider = "Incorrect Provider";
        }
    }

    public int getId() {

        id = globalID++;


        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNumber() {
        return number;
    }

    public String getProvider() {
      //  if ()

        return provider;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

