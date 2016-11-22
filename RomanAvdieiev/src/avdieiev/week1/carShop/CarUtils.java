package avdieiev.week1.carShop;


import avdieiev.week1.Car;

public class CarUtils {

    public static Car generateCars() {
        String model = generateModel();
        double fuel = generateFuel();
        boolean opened = false;
        double price = generatePrice();
        String originKey = generateKey();
        double consumption = generateCosumption();

        return new Car(model, opened, fuel, price, originKey, consumption);
    }

    private static double generateCosumption() {
        return generateNum(7, 14);
    }

    private static String generateKey() {
        String[] key = {"234", "543", "655", "678", "134", "570", "145"};
        return key[(int) (Math.random() * key.length)];
    }

    private static double generatePrice() {
        return generateNum(30000, 60000);
    }

    private static double generateFuel() {
        return generateNum(30, 60);
    }

    private static String generateModel() {
        String[] names = {"Lanos", "Sens", "BMW", "AUDI", "ZAZ", "Lexus", "Ford"};
        return names[(int) (Math.random() * names.length)];
    }

    private static int generateNum(int left, int right) {
        return left + (int) (Math.random() * (right - left));
    }

}
