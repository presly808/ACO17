package car;

import java.util.Arrays;

public class Garage {

    private Car[] cars = new Car[10];

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

        if (this.cars[this.cars.length - 1] != null) {
            this.cars = Arrays.copyOf(this.cars, this.cars.length * 2);
        }

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
}
