package carclass;

/**
 * Created by Alexandr on 19.11.2016.
 */
public class Car {

    public String model;
    public float fuel;
    public int prise;
    public int trueKey = 123;


    public boolean opened(int key) {
        boolean rigth = false;
        if (key == trueKey) {
            rigth = true;
        }
        return rigth;
    }

    public boolean closed(int key) {
        boolean rigth = false;
        if (key == trueKey) {
            rigth = true;
        }
        return rigth;
    }

    public String showInfo(){
        return model + " ," + fuel + " ," + prise  + " .";

    }





}







