package week2;

import week1.Car;

/**
 * Created by Влад on 20.11.2016.
 */
public class CarShop {

    private String name;
    private Address address;
    private Car[] cars = new Car[20];
    private double budget;

    public String showAll() {
        String res = "all cars \n ";
        for (int i = 0; i < cars.length; i++) {
            res += cars[0].showInfo() + "\n";
        }

        return res;
    }

    public String filter(int money) {
        String res = "all cars \n ";
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getPrice() <= money) {
                res += cars[0].showInfo() + "\n";
            }
        }

        return res;
    }




}
