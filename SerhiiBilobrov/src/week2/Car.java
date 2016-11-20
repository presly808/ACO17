package week2;

/**
 * Created by Maria on 19.11.2016.
 */
public class Car {

    public String model;
    public int fuel;
    public int price;
    private boolean opened;
    private String originalKey = "12345";

    public boolean open(String key){
        if(originalKey.equals(key)){
            opened = true;
        }
        return opened;
    }


}
