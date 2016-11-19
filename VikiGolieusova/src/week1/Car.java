package week1;

public class Car {

    public String model;
    public boolean opened;

    public int fuel;

    public double price;
    private String originalKey;

    public void init(String model, String originalKey, int fuel, double price) {
        this.model = model;
        this.originalKey = originalKey;
        this.fuel = fuel;
        this.price = price;
    }

    public boolean open(String key) {
        if (key.equals(originalKey)) {
            return opened = true;
        }
        return opened;
    }

    public String showAll(Car car) {
        if (car == null) {
            return null;
        }
        return String.format("model %s, fuel %d, price %.2f", car.model, car.fuel, car.price);
    }
}