package car;

public class Car {

    private String model;
    private int price;
    private String key;

    private boolean opened;
    private double fuel;

    public Car(String model, int price, String key) {
        this.model = model;
        this.price = price;
        this.key = key;
    }

    public boolean open(String key) {

        boolean isOpened = this.key.equals(key);
        this.opened = isOpened;

        return isOpened;
    }

    public boolean close(String key) {

        boolean isClosed = this.key.equals(key);
        this.opened = !isClosed;

        return isClosed;
    }

    public int charge(String type, int money, int volume) {

        int priceByLiter = 0;

        if (type.equals("80")) {
            priceByLiter = 3;
        } else if (type.equals("91")) {
            priceByLiter = 4;
        } else if (type.equals("92")) {
            priceByLiter = 5;
        } else if (type.equals("95")) {
            priceByLiter = 6;
        } else if (type.equals("98")) {
            priceByLiter = 7;
        }

        double fill = priceByLiter * volume;

        if (money >= fill && priceByLiter != 0) {
            this.fuel += volume;
            return ((int) (money - fill));
        }

        return 0;
    }

    public boolean go() {

        return this.opened && this.fuel >= 0;
    }

    public String showDetails() {

        return String.format("model - %s\nprice - %s\nkey - %s\nfuel - %.2f\nis opened - %s\n",
                this.model, this.price, this.key, this.fuel, this.opened);
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

    public boolean isOpened() {
        return opened;
    }

    public double getFuel() {
        return fuel;
    }
}
