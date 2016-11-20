package oop.week2;

/**
 * Created by Victoria on 11/19/2016.
 */
public class Car {
    public String model;
    public int fuel = 0;
    public int price;
    public boolean opened = true;
    public int keyOpen = 1111;
    public int keyClose = 1111;

    public boolean open(int key) {

        if (key == keyOpen) {
            opened = true;
        } else {
            opened = false;
        }
        return opened;
    }

    public boolean close(int key) {

        if (key == keyClose) {
            return true;
        }
        return false;
    }

    public boolean go() {
        int minFuel = 20;
        if (fuel < minFuel) {
            return false;
        }
        return true;
    }

    public String showInfo() {
        String str = new String("");
        //return fuel + " " + model;
        str = String.format("fuel %d, price %d, model %s, keyOpen %s", fuel, price, model, keyOpen, "keyClose %s", keyClose);
      //  System.out.println(str);


        return str;
    }

}

