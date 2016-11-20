import java.util.Scanner;

/**
 * Created by User on 19.1.2016.
 */
public class Car {
    public String model;
    public int fuel;
    public double price;

    public boolean open;
    public String key;

    public String showInfo() {

        String result = String.format("model % s, fuel % d, price % 2f, open / close % s",
                model, fuel, price, open);
        return result;
    }

    public  static boolean open(String userKey, Car car) {

        if (userKey.equals(car.key)) {
            return true;
        } else return car.open;
    }

    public static boolean close(String userKey, Car car) {

        if (userKey.equals(car.key)) {
            return false;
        } else return car.open;
    }

    public static int go(int distance, Car car){
        int fuelResult = car.fuel - distance/2;
        return fuelResult;

    }

    public void init(String model, int fuel, double price, boolean open){
        Car car = this;
        this.model = model;
        this.fuel = fuel;
        this.price = price;
        this.open = open;
    }

}