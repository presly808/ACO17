package carclass;

/**
 * Created by Alexandr on 19.11.2016.
 */
public class Car {

    public String model;
    public float fuel;
    public int prise;
    public int trueKey = 123;
    public float gasInHour;
    public int speed;


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

    public boolean canGo(float fuel){
        boolean drive = true;
        if(fuel == 0){
            drive = false;
        }
        return drive;
    }

    public float timeDriving(float gasInHour, float fuel){
        float timeOnDrive = fuel / gasInHour;
        return timeOnDrive;

    }








}







