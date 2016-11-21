package car.tests;

import car.Car;
import car.Garage;

public class TestGarage {
    public static void main(String[] args) {
        System.out.println("testAddCar() --> " + testAddCar());
        System.out.println("testShowAll() --> " + testShowAll());
        System.out.println("testSellCar() --> " + testSellCar());
    }

    private static boolean testAddCar() {
        Garage garage = new Garage();
        Car car = new Car("Audi", 5000, "audiKey");

        garage.addCar(car);
        return garage.getCount() == 1 && garage.getCars()[0] == car;
    }

    private static boolean testShowAll() {
        Garage garage = new Garage();
        Car car = new Car("audi", 9000, "audiKey");
        Car car1 = new Car("bmw", 7000, "bmwKey");
        Car car2 = new Car("ford", 2000, "fordKey");

        garage.addCar(car);
        garage.addCar(car1);
        garage.addCar(car2);

        return garage.showAllCars().contains("audi") &&
                garage.showAllCars().contains("bmw") &&
                garage.showAllCars().contains("ford");
    }

    private static boolean testSellCar() {
        Garage garage = new Garage();
        Car car = new Car("audi", 9000, "audiKey");
        Car car2 = new Car("ford", 2000, "fordKey");

        garage.addCar(car);
        garage.addCar(car2);
        int left = garage.sellCar(1);
        return left == 4500 && garage.getCount() == 1;
    }
}
