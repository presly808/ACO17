package week1;

import week1.Car;

public class CarTest {
    public static void main(String[] args) {

        Car car = new Car();
        car.init("audi", "yu", 20, 6, 15000.00);


        boolean opened = car.open("12");
        System.out.println(opened);

        String showInfo = car.showAll(car);
        System.out.println(showInfo);

        double resultOfFuelBalance = car.go(30);
        System.out.println(resultOfFuelBalance);

    }
}