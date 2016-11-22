package avdieiev.week1.carShop;

import avdieiev.week1.Car;

public class CarShop {

    private String name;
    private String adress;
    private double budget;
    private double money;
    private Car[] arrCars;

    public CarShop(String name, String adress, double budget, Car[] arrCars) {
        this.name = name;
        this.adress = adress;
        this.budget = budget;
        this.arrCars = arrCars;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setMoney(double money) {
        this.money = money;
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

    public double getMoney() {
        return money;
    }

    public String showAllCars() {
        String strCars = "";
        for (int i = 0; i < arrCars.length; i++) {
            Car carPlace = arrCars[i];
            if (carPlace != null) {
                strCars += carPlace.ShowAll() + "\n";
            }
        }
        return strCars;

//    public double filter(double money) {
//
    }

}
