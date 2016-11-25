package week1.CarShop;

import week1.Car.Car;
import week1.utils.CarUtils;

public class CarShopTest {

    public static void main(String[] args) {

        Car[] cars1 = new Car[10];
        cars1[0] = new Car(1, "M7", "3g0", 10000, 7, 30000.00);

        Car[] cars = new Car[10];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = CarUtils.CarGenerate();
        }
        cars[0] = new Car(1, "M7", "3g0", 60, 7, 3000.00);
        CarShop carShop1 = new CarShop("Auto", "Lenina,25", cars, 1000);

        //test showAll
        System.out.println("Test showAll method:" + (carShop1.showAll().contains("Lenina,25")));

        //test showAllCars
        System.out.println("Test showAllCars method:" + (carShop1.showAllCars().contains("id 1")));

        //test filter
        String expected = cars[0].showInfo();
        System.out.println("Test filter method:" + carShop1.filter(5000).contains(expected));

        //test buy
        cars[1] = new Car(2, "M7", "3g0", 60, 7, 3000.00);

        carShop1.buy(16000, 2);
        System.out.println("test method buy :" + String.valueOf(carShop1.getBudget() == (4000.00)));

    }
}
