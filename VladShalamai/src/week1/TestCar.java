package week1;

/**
 * Created by Влад on 20.11.2016.
 */
public class TestCar {

    public static void main(String[] args) {
        Car car = new Car("bmw", 10, 5000, true, 123, 1);

        testShowInfo(car);
        testCarGo(car);
        testCarOpen(car);
        testCarClose(car);

    }

    public static void testShowInfo(Car car) {
        System.out.println("method showInfo() is " +
                car.showInfo().equals("model: bmw, fuel: 10, price: 5000,00, opened true"));
    }

    public static void testCarGo(Car car) {
        int expFuel1 = 9;
        int expFuel2 = 7;

        car.go();
        System.out.println("method go() is " + (car.getFuel() == expFuel1));
        car.go(200);
        System.out.println("method go(int km) is " + (car.getFuel() == expFuel2));
    }

    public static void testCarOpen(Car car) {
        System.out.println("method open() is " + car.open(123));
    }

    public static void testCarClose(Car car) {
        System.out.println("method close() is " + !car.close(123));
    }
}
