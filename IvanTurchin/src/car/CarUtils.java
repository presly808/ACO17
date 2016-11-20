package car;

public class CarUtils {

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
            car.fuel += volume;
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
}
