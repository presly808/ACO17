package car;

public class Car {

    private String model;
    private int price;
    private String key;

    public boolean opened;
    public double fuel;

    public Car(String model, int price, String key) {
        this.model = model;
        this.price = price;
        this.key = key;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public String getKey() {
        return key;
    }
}
