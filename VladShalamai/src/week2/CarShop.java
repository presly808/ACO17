package week2;

import week1.Car;

public class CarShop {

    private String name;
    private Address address;
    private Car[] cars = new Car[20];
    private double budget;

    public CarShop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String showAll() {
        String res = "all cars \n";
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                res += cars[i].showInfo() + "\n";
            }
        }

        return res;
    }

    public String filter(int money) {
        String res = "all cars \n";
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null && cars[i].getPrice() <= money) {
                res += cars[i].showInfo() + "\n";
            }
        }

        return res;
    }


}
