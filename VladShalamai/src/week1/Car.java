package week1;

/**
 * Created by Влад on 19.11.2016.
 */
public class Car {
    private int id;
    private String model;
    private int fuel;
    private double price;
    private boolean opened;
    private int key;
    private static final int FUEl_CONSUMPTION = -1;

    public Car(String model, int fuel, double price, boolean opened, int key, int id) {
        this.model = model;
        this.fuel = fuel;
        this.price = price;
        this.opened = opened;
        this.key = key;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public int getFuel() {
        return fuel;
    }

    public String getModel() {
        return model;
    }

    public boolean getOpened() {
        return opened;
    }

    public String showInfo() {
        return String.format("id:%d model: %s, fuel: %d, price: %.2f, opened %b", id, model, fuel, price, opened);
    }

    public void go() {
        fuel += FUEl_CONSUMPTION;
    }

    public void go(int km) {
        fuel -= km / 100;
    }

    public boolean open(int key) {

        if (this.key == key) {
            opened = true;
        }
        return opened;
    }

    public boolean close(int key) {

        if (this.key == key) {
            opened = false;
        }
        return opened;
    }



}
