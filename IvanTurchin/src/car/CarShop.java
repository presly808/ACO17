package car;

public class CarShop {

    private String name;
    private String address;
    private Car[] cars;
    private int amount;

    public CarShop(String name, String address, Car[] cars, int amount) {
        this.name = name;
        this.address = address;
        this.cars = cars;
        this.amount = amount;
    }

    public String shopDetails() {

        return String.format("Name - %s\naddress - %\ncars - %\namount - %d",
                this.name, this.address, this.cars.length, this.amount);
    }

    public String showCars() {
        String res = "";

        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] != null) {
                res += this.cars[i].getModel() + "\n";
            }
        }

        return res;
    }

    public String filter(int money) {
        String res = "";

        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i].getPrice() <= money) {
                res += this.cars[i].showDetails() + "\n";
            }
        }

        return res;
    }

    public Car buy(int money, int index) {
        if (index <= 0 || index > this.cars.length) {
            return null;
        }

        if (money >= this.cars[index - 1].getPrice()) {
            this.cars[index - 1] = null;

            Car[] temp = new Car[this.cars.length];

            for (int i = 0; i < this.cars.length; i++) {
                if (this.cars[i] != null) {
                    temp[i] = this.cars[i];
                }
            }

            this.cars = temp;
            this.amount += money;

            return this.cars[index - 1];
        }

        return null;
    }
}

class ShopList {

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
