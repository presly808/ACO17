package week1.CarShop;

import week1.Car.Car;
import week1.utils.CarUtils;

public class CarShopTest {

    public static void main(String[] args) {

        Car[] cars1 = new Car[10];
        cars1[0] = new Car(1,"M7", "3g0", 10000, 7, 30000.00);

        Car[] cars = new Car[10];

        for (int i = 0; i < cars.length ; i++) {
            cars[i] = CarUtils.CarGenerate();

        }

        CarShop carShop1 = new CarShop("Auto","Lenina,25", cars, 1000);

        String show = carShop1.showAll();
        System.out.println(show);

        String carsList = carShop1.showAllCars();
        System.out.println(carsList);

        String filter = carShop1.filter(7000);
        System.out.println(filter);

        carShop1.buy(18000, 2);

        String show1 = carShop1.showAllCars();
        System.out.println(show1);
        System.out.println(carShop1.getBudget());

    }

}
