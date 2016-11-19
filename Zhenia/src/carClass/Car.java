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

    public String carOut(){
        String str = "";

        str = str.format("Model %s\nFuel %s\nFuel consume per km %.2f\nPrice %d",
                model, fuel, fuelConsume, price);

        return str;
    }
}
