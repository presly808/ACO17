/**
 * Created by Влад on 19.11.2016.
 */
public class Car {
    private String model;
    private int fuel;
    private double price;
    private boolean opened;

    public void init (String model, int fuel, double price, boolean opened) {
        this.model = model;
        this.fuel = fuel;
        this.price = price;
        this.opened = opened;
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

    public String  showInfo() {
        return String.format("model: %s, fuel: %d, price: %.2f, opened %b", model, fuel, price, opened);
    }

    /*public void go() {

    }

    public void go() {

    }*/
}
