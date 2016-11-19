package car;

import java.util.Arrays;

public class CarUtils {

    public Car[] cars = new Car[0];

    private int findLast() {
        int res = 0;

        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] != null) {
                res++;
            }
        }

        return res;
    }

    public Car shop(int money, String model) {

        Car car = null;

        if (model.equals("audi") && money >= 10000) {
            car = new Car("audi", 10000, "audiKey");
        } else if (model.equals("bmw") && money >= 9000) {
            car = new Car("bmw", 9000, "bmwKey");
        } else if (model.equals("ferrari") && money >= 40000) {
            car = new Car("ferrari", 40000, "ferrariKey");
        } else if (model.equals("ford") && money >= 4000) {
            car = new Car("ford", 4000, "fordKey");
        }

        this.cars = Arrays.copyOf(this.cars, this.cars.length + 1);
        this.cars[findLast()] = car;

        return car;
    }

    public String showAll() {
        String res = "";

        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] != null) {
                res += this.cars[i].getModel() + "\n";
            }
        }

        return res;
    }

    public boolean open(Car car, String key) {

        if (car == null) {
            return false;
        }

        boolean isOpened = car.getKey().equals(key);
        car.opened = isOpened;

        return isOpened;
    }

    public boolean close(Car car, String key) {

        if (car == null) {
            return false;
        }

        boolean isClosed = car.getKey().equals(key);
        car.opened = !isClosed;

        return isClosed;
    }

    public int charge(Car car,String type, int money, int volume) {

        int priceByLiter = 0;

        if (type.equals("80")) {
            priceByLiter = 3;
        } else if (type.equals("91")) {
            priceByLiter = 4;
        } else if (type.equals("92")) {
            priceByLiter = 5;
        } else if (type.equals("95")) {
            priceByLiter = 6;
        } else if (type.equals("98")) {
            priceByLiter = 7;
        }

        double fill = priceByLiter * volume;

        if (car != null && money >= fill && priceByLiter != 0) {
            car.fuel = volume;
            return ((int) (money - fill));
        }

        return 0;
    }

    public boolean go(Car car) {

        return car != null && car.opened && car.fuel >= 0;
    }

    public String showDetails(Car car) {

        return String.format("model - %s\nprice - %s\nkey - %s\nfuel - %.2f\nis opened - %s\n",
                car.getModel(), car.getPrice(), car.getKey(), car.fuel, car.opened);
    }

    public Car[] getCars() {
        return cars;
    }
}
