package week1;

import week1.Car;

/**
 * Created by Влад on 19.11.2016.
 */
public class TestCaropen {

    public static void main(String[] args) {

        Car car = new Car("bmw", 10, 5000, true, 123);

        System.out.println("method open() is " + car.open(123));
    }
}
