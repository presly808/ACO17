package week1;

import week1.Car;

/**
 * Created by Влад on 19.11.2016.
 */
public class TestCarshowInfo {
    public static void main(String[] args) {
        Car car = new Car("bmw", 10, 5000, true, 123);
        System.out.print("method showInfo() is " + car.showInfo().equals("model: bmw, fuel: 10, price: 5000,00, opened true"));
    }
}
