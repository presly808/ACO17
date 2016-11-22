package contactlist;

import week2.CarUtils;

public class ContactUtils {

    private static String name;

    public static Contact generateContact(int i) {

        return new Contact(generateName(i), generateEmail(), generatePoneNumber());
    }

    public static String generateName(int i) {

        String[] names = {"John", "Anton", "Vlad", "Oksana", "Lida", "Maks", "Mark", "Alina", "Karina", "Volodymyr","John", "Anton", "Vlad", "Oksana", "Lida", "Maks", "Mark", "Alina", "Karina", "Volodymyr"};
        name = names[i];
        return name;
    }

    public static String generateEmail() {

        return name.toLowerCase() + "@gmail.com";
    }

    public static String generatePoneNumber() {

        String[] operators = {"095", "097", "093"};

        StringBuilder sb = new StringBuilder();
        sb.append(operators[CarUtils.generateNum(0, 3)]).append(" ");
        sb.append(String.valueOf(CarUtils.generateNum(100, 999))).append(" ");
        sb.append(String.valueOf(CarUtils.generateNum(10, 99))).append(" ");
        sb.append(String.valueOf(CarUtils.generateNum(10, 99)));

        return sb.toString();
    }
}
