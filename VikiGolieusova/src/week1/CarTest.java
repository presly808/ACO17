package week1;

import week1.Car;

public class CarTest {
    public static void main(String[] args) {

        Car car = new Car();
        car.init("audi", "yu", 20, 15000.00);


        boolean opened = car.open("12");
        System.out.println(opened);

        String show = car.showAll(car);
        System.out.println(show);
    }
}