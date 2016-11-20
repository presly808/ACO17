package week2.cars;

/**
 * Created by Maria on 19.11.2016.
 */
public class Car {

    private String model;
    private int fuel;
    private int price;
    private boolean opened;
    private String originalKey;

    public Car(String model, int fuel, int price, String originalKey){
        // input args validation
        this.model = model;
        this.fuel = fuel;
        this.price = price;
        this.originalKey = originalKey;
    }

    public void fillIn(int inFuel){
        if(inFuel < 0){
            return;
        }

        this.fuel += inFuel;
    }

    public boolean open(String key){
        if(originalKey.equals(key)){
            opened = true;
        }
        return opened;
    }

    public int getFuel(){
        return fuel;
    }

    public int getPrice() {
        return price;
    }

    public String fullInfo(){
        return String.format("model %s, fuel %d, price %d, opened %s",
                                model, fuel, price, opened);
    }


}
