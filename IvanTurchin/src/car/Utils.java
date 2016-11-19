package car;

public class Utils {

    public Car shop(int money, String model) {

        if (model.equals("audi") && money >= 10000) {
            return new Car("audi", 10000, "audiKey");
        } else if (model.equals("bmv") && money >= 9000) {
            return new Car("bmv", 9000, "bmvKey");
        } else if (model.equals("ferrari") && money >= 40000) {
            return new Car("ferrari", 40000, "ferrariKey");
        } else if (model.equals("ford") && money >= 4000) {
            return new Car("ford", 4000, "fordKey");
        }

        return null;
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

    public double charge(Car car,String type, int money) {

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

        if (car != null && money >= priceByLiter && priceByLiter != 0) {
            car.fuel = money / priceByLiter;
            return money / priceByLiter;
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
}
