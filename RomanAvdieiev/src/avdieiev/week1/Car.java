package avdieiev.week1;

public class Car {

    public String model;
    public boolean opened;

    public double fuel;
    public double price;
    public String originKey;
    public double consumption;


    public void init(String model, boolean opened, double fuel, double price, String originKey, double consumption) {
        Car car = this;
        // this.model = model;
        car.model = model;
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

    public String ShowAll(Car car) {
        if (car == null) {
            return null;
        }
        return "Model - " + model + "; " + " Opened - " + opened + "; " + " Fuel - " + fuel + "; " +
                " Price - " + price + "; " + "Consumption " + consumption;
        //    return String.format("model %s, fuel %d, price %.2f", car.model, car.fuel, car.price);
    }

    public double go(int km) {
        if (fuel == 0) {
            return 0;
        } else if (opened == false){
            return 0;
        }
        double consumption1 = 100 / consumption;
        fuel = fuel - (km / consumption1);
        if (fuel < km / consumption1){
            return 0;
        }
        return fuel;
    }
}
