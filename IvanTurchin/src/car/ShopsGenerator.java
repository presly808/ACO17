package car;

public class ShopsGenerator {

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
