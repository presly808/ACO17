package oop.week2;

/**
 * Created by Victoria on 11/19/2016.
 */
public class Car {
    private String model;
    private int fuel;
    private int price;
    private boolean opened;
    private int keyOpen;
    private int keyClose;


    public Car(String model) {
        this.model = model; //    полю обякта присвою значення з параметра
        this.fuel = 0;
        this.opened = false;
        this.keyOpen = 1111;
        this.keyClose = 2222;
    }

    public boolean open(int key) {
        if (this.isOpened()) {
            return this.opened;
        }
        if (key == this.keyOpen) {
            this.opened = true;
        } else {
            this.opened = false;
        }
        return this.opened;
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

    public String getInfoString() {
        return String.format("fuel %d, price %d, model %s, keyOpen %s, keyClose %s ",
                fuel, price, model, keyOpen, keyClose);
    }

    public String getModel() {
        return model;
    }

    public int getFuel() {
        return fuel;
    }

    public int getPrice() {
        return price;
    }

    public boolean isOpened() {
        return opened;
    }

    public int getKeyOpen() {
        return keyOpen;
    }

    public int getKeyClose() {
        return keyClose;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }

    public void setKeyOpen(int keyOpen) {
        this.keyOpen = keyOpen;
    }

    public void setKeyClose(int keyClose) {
        this.keyClose = keyClose;
    }
}

