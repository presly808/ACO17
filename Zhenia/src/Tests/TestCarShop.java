package Tests;

import carClass.Car;
import carShopClass.CarShop;

/**
 * Created by zhenia on 20.11.16.
 */
public class TestCarShop {
    public static void main(String[] args) {
        Car[] arr = new Car[3];

        arr[0] = new Car("Volga", 100, 0.5, 10000, "carkey");
        arr[1] = new Car("Zhiguli", 80, 1, 15000, "carkey");
        arr[2] = new Car("Pobeda", 120, 1.5, 25000, "carkey");

        CarShop shop = new CarShop(arr, "My Shop", "Kiev", 0);

        System.out.println(shop.showAll());

        System.out.println("Is filter test passed: " + testFilter(arr, shop) + "\n");

        if(shop.addCar(new Car("Moskvich", 120, 1.5, 25000, "carkey"))) {
            System.out.println(shop.showAll());
        }

        shop.buy(20000, 1);

        System.out.println(shop.showAll());

    }

    public static boolean testFilter(Car[] arr, CarShop shop) {
        Car[] exp = {arr[0], arr[1]};

        Car[] res = shop.filter(15000);

        boolean isPassed = true;

        for(int i = 0; i < exp.length; i++) {
            isPassed = isPassed && exp[i].equals(res[i]);
        }

        return isPassed;
    }
}
