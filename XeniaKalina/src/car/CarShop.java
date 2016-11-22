package car;

/**
 * Created by User on 20.11.2016.
 */
public class CarShop {
     private String name;
     private double budget;

     private String city;
     private String street;
     private int house;

    Car[] cars = new Car[20];

    public String showAll() {
        String result = " ";
        for (int i = 0; i <= 20; i++) {
            result += cars[i];
        }
        return result.format("name: %s, budget: %.2f, adress: %s, %s, %d", name, budget, city, street, house);
    }

}