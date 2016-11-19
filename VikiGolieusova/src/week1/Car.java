package week1;

public class Car {

    public String model;

    private String originalKey;
    public boolean opened;

    public double fuel;
    public int consumption;

    public double price;


    public void init(String model, String originalKey, double fuel, int consumption, double price) {
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

    public String showAll(Car car) {
        if (car == null) {
            return null;
        }
        return String.format("model %s, fuel %.2f, consumption %d, price %.2f", car.model, car.fuel, car.consumption, car.price);
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