package week1.CarShop;

import week1.Car.Car;

public class CarShop {

    private Car[] cars;
    private String name;
    private String adress;
    private double budget;


    public CarShop(String name, String adress, Car[] cars, double budget) {
        this.cars = cars;
        this.name = name;
        this.adress = adress;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public double getBudget() {
        return budget;
    }

     public String showAll() {
        return String.format("name %s, adress %s, budget %.2f", getName(), getAdress(), getBudget());
    }

    public String showAllCars() {
        String strCars = "";
        for (int i = 0; i < cars.length; i++) {
            Car carPlace = cars[i];
            if (carPlace != null) {
                strCars += carPlace.showInfo() + "\n";
            }
        }
        return strCars;
    }

    public String filter(int money) {
        String filterResult = "";

        for (int i = 0; i < cars.length; i++) {

            if (cars[i].getPrice() <= money && money != 0 && cars[i] != null) {

                filterResult += cars[i].showInfo() + "\n";
            }
        }
        return filterResult;
    }

    public String buy(int money, int ID) {
        String s = "";
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getId() == ID && money >= cars[i].getPrice()) {
                s = cars[i].showInfo();
                System.out.println("You buy:" + s);
                budget = budget + cars[i].getPrice();
                cars[i] = null;
            }
        }
        return s;
    }

}
