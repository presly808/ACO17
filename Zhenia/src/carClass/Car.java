package carClass;

/**
 * Created by zhenia on 19.11.16.
 */
public class Car {
    private String model;
    private double fuel;
    private double fuelConsume;
    private int price;

    private boolean opened;
    private String key;

    public Car(String model, double fuel, double fuelConsume, int price, String key){
        this.model = model;
        this.fuel = fuel;
        this.fuelConsume = fuelConsume;
        this.price = price;
        this.key = key;
        this.opened = false;
    }

    public boolean open(String key) {
        if(this.key.equals(key) && this.opened == false) {
            this.opened = true;

            return true;
        }

        return false;
    }

    public boolean close(String key) {
        if(this.key.equals(key) && this.opened == true) {
            this.opened = false;

            return true;
        }

        return false;
    }

    public String showInfo(){
        String str = "";

        str = str.format("Model %s\nFuel %s\nFuel consume per km %.2f\nPrice %d\n",
                model, fuel, fuelConsume, price);

        return str;
    }

    public boolean go(){
        return fuel > 0 ? true : false;
    }

    public double go(double km){
        if (km <= 0) {
            return 0;
        }

        double consumed = km * fuelConsume;

        if (fuel >= consumed) {
            fuel -= consumed;

            return km;
        } else {
            consumed = fuel;
            fuel = 0;

            return consumed / fuelConsume;
        }
    }
}
