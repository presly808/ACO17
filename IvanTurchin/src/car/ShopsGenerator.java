package car;

public class ShopsGenerator {

    public static CarShop otherCarsShop() {
        Car car = new Car("gigul", 1000, "gigulKey");
        Car car1 = new Car("volfswagen", 6000, "volfswagenKey");

        Car[] cars = {car, car1};
        CarShop carShop = new CarShop("Selled cars", "192.65.34", cars, 500000);
        return carShop;
    }

    public static CarShop fordShop() {
        Car[] cars = new Car[7];

        for (int i = 0; i < 7; i++) {
            String name = "ford.type" + (i + 1);
            int price = 2000 + (i * 100);
            String key = "ford.type" + (i + 1) + "Key";

            cars[i] = new Car(name, price, key);
        }

        CarShop carShop = new CarShop("Ford shop", "192.23.234",cars, 50000);
        return carShop;
    }

    public static CarShop audiShop() {
        Car[] cars = new Car[7];

        for (int i = 0; i < 7; i++) {
            String name = "audi.type" + (i + 1);
            int price = 8000 + (i * 100);
            String key = "audi.type" + (i + 1) + "Key";

            cars[i] = new Car(name, price, key);
        }

        CarShop carShop = new CarShop("Audi shop", "192.93.544",cars, 100000);
        return carShop;
    }

    public static CarShop bmwShop() {
        Car[] cars = new Car[7];

        for (int i = 0; i < 7; i++) {
            String name = "bmw.type" + (i + 1);
            int price = 6000 + (i * 100);
            String key ="bmw.type" + (i + 1) + "Key";

            cars[i] = new Car(name, price, key);
        }

        CarShop carShop = new CarShop("Bmw shop", "192.23.234",cars, 50000);
        return carShop;
    }
}
