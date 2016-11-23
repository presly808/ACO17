package moto;

public class Motorcycle {

    private String model;
    private int price;
    private int mileage;
    private String key;
    private boolean isOpen;
    private double fuel;
    private boolean serviceability;

    public final int priceByLiter = 10;

    public Motorcycle(String model, int price, String key) {
        this.model = model;
        this.price = price;
        this.key = key;

        this.mileage = 0;
        this.isOpen = false;
        this.serviceability = true;
    }

    public boolean open(String key) {
        if (this.key.equals(key)) {
            this.isOpen = true;
        }

        return this.isOpen;
    }

    public boolean close(String key) {
        if (this.key.equals(key)) {
            this.isOpen = false;
        }

        return this.isOpen;
    }

    public double fillIn(int money) {

        if (this.fuel >= 250 - money / priceByLiter) {
            return 0;
        }
        this.fuel = money / priceByLiter;

        return this.fuel;
    }

    public boolean go() {

        if (this.isOpen && this.fuel > 0) {
            this.fuel--;
            this.mileage++;

            if (mileage == 50) {
                this.serviceability = false;
            }

            return true;
        }

        return false;
    }

    public void fixInit(String key) {
        if (key.equals(";olk!1hsgo@goiu#ruRy98")) {
            this.serviceability = true;
        }
    }

    public String showInfo() {

        return String.format("model - %s\nprice - %s\nmileage - %d\nkey - %s\nis open - %s\nfuel - %.2f\nserviceability - %s",
                this.model, this.price, this.mileage, this.key, this.isOpen, this.fuel, this.serviceability);
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getMileage() {
        return mileage;
    }

    public String getKey() {
        return key;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public double getFuel() {
        return fuel;
    }

    public boolean isServiceability() {
        return serviceability;
    }
}
