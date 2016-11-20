package week1;

import week1.Car;

/**
 * Created by Влад on 19.11.2016.
 */
public class TestCargo {
    public static void main(String[] args) {
        Car car = new Car("bmw", 10, 5000, true, 123);
        int expFuel1 = 9;
        int expFuel2 = 7;

        car.go();
        System.out.println("method go() is " + (car.getFuel() == expFuel1) );
        car.go(200);
        System.out.println("method go(int km) is " + (car.getFuel() == expFuel2) );

    }
}
