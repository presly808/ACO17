package Tests;

import carClass.Car;

/**
 * Created by zhenia on 19.11.16.
 */
public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("Volga", 100, 0.5, 10000, "carkey");

        System.out.println(car1.carOut());
    }
}
