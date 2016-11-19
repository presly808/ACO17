package car.test;

import car.Car;
import car.Utils;

public class TestCarUtils {
    public static void main(String[] args) {

        System.out.println("test buying car --> " + testBuyCar());
        System.out.println("test open car --> " + testOpenCar());
        System.out.println("test charge car --> " + testChargeCar());
        System.out.println("test moving car --> " + testMoveCar());
        System.out.println("test show details --> " + testShowDetails());

    }

    private static boolean testBuyCar() {
        Utils carUtils = new Utils();

        Car myCar = carUtils.shop(10000, "bmv");
        boolean test = myCar != null;

        Car myCar1 = carUtils.shop(3000, "ferrari");
        boolean test1 = myCar1 == null;

        Car myCar2 = carUtils.shop(10000, "test");
        boolean test2 = myCar2 == null;

        return test && test1 && test2;
    }

    private static boolean testOpenCar() {
        Utils carUtils = new Utils();
        Car myCar = carUtils.shop(10000, "bmv");

        String key = myCar.getKey();

        boolean test = carUtils.open(myCar, key);
        boolean test1 = !carUtils.open(myCar, "<test>");
        boolean test2 = !carUtils.open(null, key);

        return test && test1 && test2;
    }

    private static boolean testChargeCar() {
        Utils carUtils = new Utils();
        Car myCar = carUtils.shop(10000, "bmv");

        boolean test = carUtils.charge(myCar, "92", 400) == myCar.fuel;
        boolean test1 = carUtils.charge(myCar, "92", 400) == 80;
        boolean test2 = carUtils.charge(null, "92", 400) == 0;
        boolean test3 = carUtils.charge(myCar, "100", 400) == 0;
        boolean test4 = carUtils.charge(myCar, "92", 1) == 0;

        return test && test1 && test2 && test3 && test4;
    }

    private static boolean testMoveCar() {
        Utils carUtils = new Utils();
        Car myCar = carUtils.shop(10000, "bmv");

        carUtils.open(myCar, myCar.getKey());
        carUtils.charge(myCar, "95", 200);

        return carUtils.go(myCar);
    }

    private static boolean testShowDetails() {
        Utils carUtils = new Utils();
        Car myCar = carUtils.shop(10000, "bmv");

        String temp = carUtils.showDetails(myCar);

        return temp.length() != 0 && temp.contains("bmv") && temp.contains(myCar.getKey());
    }
}
