package week2.cars;

/**
 * Created by Maria on 20.11.2016.
 */
public class TestCarShop {

    public static void main(String[] args) {

        Car[] cars = new Car[10];
        cars[0] = new Car("BMV M5", 100, 10000, "12345");

        CarShop carShop = new CarShop("BMV", "Kilceva", cars, 1000);

        String listOfCars = carShop.showAllCars();
        System.out.println(listOfCars);

        Car car = carShop.buy(0, 10000);

        System.out.println("You car is " + car.fullInfo());

    }
}
