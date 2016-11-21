package week2;

import week1.Car;


public class TestCarShop {
    private static final int AMOUNT_CAR = 10;
    private static final int MAX_PRICE = 2000;

    public static void main(String[] args) {

        CarShop carShop = new CarShop("Shop 1");

        int id = 0;
        for (int i = 0; i < AMOUNT_CAR; i++) {
            carShop.getCars()[i] = new Car(CarUtils.generateModel(), CarUtils.generateFuel(),
                    CarUtils.generatePrice(), false, CarUtils.generateKey(), id++);
        }

        testShowAll(carShop);
        testFilter(carShop);
        testBuy(carShop);
        testAddCar(carShop);

    }

    public static void testShowAll(CarShop carShop) {

        String res = carShop.showAll();

        System.out.println("method showAll() is " + (res.contains("id:0") && res.contains("id:9")));
    }

    public static void testFilter(CarShop carShop) {
        int expected = 0, actual;
        String res = carShop.filter(MAX_PRICE);

        for (int i = 0; i < carShop.getCars().length; i++) {
            if (carShop.getCars()[i] != null && carShop.getCars()[i].getPrice() < MAX_PRICE) {
                expected++;
            }
        }
        actual = res.split("model").length - 1;

        System.out.println("method filter() is " + (actual == expected));

    }

    public static void testBuy(CarShop carShop) {

        Car expected = carShop.getCars()[0];
        Car actual = carShop.buy(10000, 0);

        System.out.println("method buy() is " + (expected == actual));

    }

    public static void testAddCar(CarShop carShop) {
        int expected, actual;
        Car car = new Car(CarUtils.generateModel(), CarUtils.generateFuel(),
                CarUtils.generatePrice(), false, CarUtils.generateKey(), 10);

        expected = CarUtils.amountCar(carShop) + 1;
        carShop.addCar(car);
        actual = CarUtils.amountCar(carShop);

        System.out.println("method addCar() is " + (expected == actual));
    }

}
