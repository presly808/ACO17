package car;

public class Car {

    private String model;
    private String key;
    private int price;

    public double fuel;
    public boolean opened;

    public Car(String model, int price, String key) {
        this.model = model;
        this.price = price;
        this.key = key;
    }

    public String getModel() {
        return this.model;
    }

    public int getPrice() {
        return this.price;
    }

    public String getKey() {
        return key;
    }
}
