package avdieiev.week1;

public class Car {

    private String model;

    private int autoID;
    private boolean opened;
    private double fuel;
    private double price;
    private String originKey;
    private double consumption;
    public Car(String model, int autoID, boolean opened, double fuel, double price, String originKey, double consumption) {
        Car car = this;
        // this.model = model;
        car.model = model;
        car.autoID = autoID;
        car.opened = opened;
        car.fuel = fuel;
        car.price = price;
        car.originKey = originKey;
        this.consumption = consumption;

    }
    public boolean open(String key) {
        if (originKey.equals(opened)) {
            opened = true;
        }
        return opened;
    }
    public String ShowAll() {
//        return "Model - " + model + "; " + " Opened - " + opened + "; " + " Fuel - " + fuel + "; " +
//                " Price - " + price + "; " + "Consumption " + consumption;
        return String.format("model %s, autoID %d, opened %s, fuel %.2f, price %.2f, consumption %.2f", model, autoID, opened, fuel, price, consumption);
    }


    public double go(int km) {
        if (fuel == 0) {
            return 0;
        } else if (opened == false) {
            return 0;
        }
        double consumption1 = 100 / consumption;
        fuel = fuel - (km / consumption1);
        if (fuel < km / consumption1) {
            return 0;
        }
        return fuel;
    }

    public double getPrice() {
        return price;
    }

    public int getAutoID() {
        return autoID;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", autoID=" + autoID +
                ", opened=" + opened +
                ", fuel=" + fuel +
                ", price=" + price +
                ", originKey='" + originKey + '\'' +
                ", consumption=" + consumption +
                '}';
    }
}
