package car;

import java.util.Arrays;

public class CarShop {

    private String name;
    private String address;
    private Car[] cars;
    private int amount;

    public CarShop(String name, String address, Car[] cars, int amount) {
        this.name = name;
        this.address = address;
        this.cars = cars;
        this.amount = amount;
    }

    public String shopDetails() {

        return String.format("Name - %s\naddress - %s\ncars - %d\namount - %d",
                this.name, this.address, this.cars.length, this.amount);
    }

    public String showCars() {
        String res = "";

        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] != null) {
                res += this.cars[i].getModel() + "\n";
            }
        }

        return res;
    }

    public String filter(int money) {
        String res = "";

        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i].getPrice() <= money) {
                res += this.cars[i].showDetails() + "\n";
            }
        }

        return res;
    }

    public Car buy(int money, int index) {
        if (index <= 0 || index > this.cars.length) {
            return null;
        }

        if (money >= this.cars[index - 1].getPrice()) {
            Car res = this.cars[index - 1];
            this.cars[index - 1] = null;

            Car[] temp = new Car[this.cars.length];

            for (int i = 0; i < this.cars.length; i++) {
                if (this.cars[i] != null) {
                    temp[i] = this.cars[i];
                }
            }

            this.cars = temp;
            this.amount += money;

            return res;
        }

        return null;
    }

    public int sellCar(Car car) {

        this.cars = Arrays.copyOf(this.cars, this.cars.length - 1);
        this.cars[this.cars.length - 1] = car;

        this.amount += car.getPrice() / 2;
        return car.getPrice() / 2;
    }

    public Car[] getCars() {
        return cars;
    }

    public int getAmount() {
        return amount;
    }
}

