package week1.Car;

public class Car {

    private String model;

    private String originalKey;
    private boolean opened;

    private double fuel;
    private int consumption;

    private double price;


    public double getPrice() {
        return price;
    }

    public Car(String model, String originalKey, double fuel, int consumption, double price) {
        this.model = model;
        this.originalKey = originalKey;
        this.fuel = fuel;
        this.price = price;
        this.consumption = consumption;
    }

    public boolean open(String key) {
        if (originalKey.equals(key)) {
            return opened = true;
        }
        return opened;
    }

    public boolean close(String key) {
        if (originalKey.equals(key) && opened) {
            return opened = false;
        }
        return opened;
    }

    public String showInfo() {

        return String.format("model %s, fuel %.2f, consumption %d, price %.2f", model, fuel, consumption, price);
    }

    public double go(int km) {
        if (!opened || fuel == 0) {
            return 0;
        } else if (fuel < (km / (100 / consumption))) {
            return 0;
        }
        fuel = fuel - (km / (100 / consumption));

        return fuel;
    }
}