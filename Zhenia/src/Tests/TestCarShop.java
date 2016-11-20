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
    }
}
