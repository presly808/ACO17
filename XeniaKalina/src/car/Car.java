package car;

/**
 * Created by User on 19.1.2016.
 */
public class Car {
    private String model;
    private int fuel;
    private double price;

    private boolean open;
    private String key;

    public String showInfo() {

        String result = String.format("model %s, fuel %d, price %.2f, open / close %s",
                model, fuel, price, open);
        return result;
    }

    public boolean open(String userKey) {

        if (userKey.equals(key)) {
            return true;
        } else return open;
    }

    public boolean close(String userKey) {

        if (userKey.equals(key)) {
            return false;
        } else return open;
    }

    public int go(int distance) {
        int fuelResult = fuel - distance / 2;
        return fuelResult;

    }

    public Car(String model, int fuel, double price, boolean open, String key) {
        this.model = model;
        this.fuel = fuel;
        this.price = price;
        this.open = open;
        this.key = key;
    }

    public int getFuel() {
        return fuel;
    }

}