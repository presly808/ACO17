package car.tests;

import car.Car;
import car.CarShop;
import car.ShopsGenerator;

public class TestCarShop {
    public static void main(String[] args) {
        System.out.println("testShopDetails() --> " + testShopDetails());
        System.out.println("testShowCars() --> " + testShowCars());
        System.out.println("testFilter() --> " + testFilter());
        System.out.println("testBuy() --> " + testBuy());
        System.out.println("testSell() --> " + testSell());
    }

    private static boolean testShopDetails() {
        CarShop carShop = ShopsGenerator.audiShop();

        String temp = carShop.shopDetails();

        return temp.contains("Audi shop") && temp.contains("192.93.544")
                && temp.contains(carShop.getCars().length + "") && temp.contains(carShop.getAmount() + "");
    }

    private static boolean testShowCars() {
        CarShop carShop = ShopsGenerator.bmwShop();

        return carShop.showCars().contains("bmw");
    }

    private static boolean testFilter() {
        CarShop carShop = ShopsGenerator.fordShop();

        String filter = carShop.filter(2300);
        return filter.contains("ford.type1") &&
                filter.contains("ford.type2") &&
                filter.contains("ford.type3") &&
                filter.contains("ford.type4");
    }

    private static boolean testBuy() {
        CarShop carShop = ShopsGenerator.audiShop();

        Car car = carShop.buy(10000, 4);

        return car.getModel().equals("audi.type4") &&
                car.getPrice() == 8300;
    }

    private static boolean testSell() {
        Car car = new Car("audi.type6", 8500, "audi.type6Key");

        CarShop carShop = ShopsGenerator.audiShop();
        int left = carShop.sellCar(car);

        return left == 4250;
    }
}
