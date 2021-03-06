package car;

import java.util.Arrays;

public class Garage {

    private Car[] cars = new Car[10];
    private int count;

    private int lastIndex() {
        int res = 0;

        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] != null) {
                res++;
            }
        }

        return res;
    }

    public void addCar(Car car) {
        if (car == null) {
            return;
        }

        if (count == this.cars.length) {
            this.cars = Arrays.copyOf(this.cars, this.cars.length * 2);
        }
        count++;
        this.cars[lastIndex()] = car;
    }

    public String showAllCars() {
        String res = "";

        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] != null) {
                res += this.cars[i].getModel() + "\n";
            }
        }

        return res;
    }

    public int sellCar(int index) {
        if (index <= 0 || index > this.cars.length) {
            return 0;
        }

        Car res = this.cars[index - 1];

        CarShop carShop = ShopsGenerator.otherCarsShop();
        carShop.sellCar(this.cars[index - 1]);

        this.cars[index - 1] = null;
        Car[] temp = new Car[this.cars.length];
        int j = 0;
        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] != null) {
                temp[i] = this.cars[j];
            }
            j++;
        }

        this.count--;
        this.cars = Arrays.copyOf(temp, temp.length - 1);

        return res.getPrice() / 2;
    }

    public int getCount() {
        return count;
    }

    public Car[] getCars() {
        return cars;
    }
}
