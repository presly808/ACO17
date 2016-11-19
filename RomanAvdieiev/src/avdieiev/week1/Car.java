package avdieiev.week1;

public class Car {

    public String model;
    public boolean opened;

    public double fuel;
    public double price;
    public String originKey;

    public void init(String model, boolean opened, double fuel, double price,String originKey) {
        Car car = this;
        car.model = model;
        car.opened = opened;
        car.fuel = fuel;
        car.price = price;
        car.originKey = originKey;
    }

    public boolean open(String key){
        if (originKey.equals(opened)){
            opened = true;
        }
        return opened;
    }
}
