package week2;

import week1.Car;

public class CarUtils {

    public static Car generateCar() {

        String model = generateModel();
        int fuel = generateFuel();
        double price = generatePrice();
        boolean opened = false;
        int key = generateKey();

        return new Car(model, fuel, price, opened, key);

    }

    private static int generateKey() {
        return generateNum(0, 100);
    }

    private static int generateNum(int left, int right) {
        return left + (int) (Math.random() * (right - left));
    }

    private static double generatePrice() {
        return generateNum(1000, 5000);
    }

    private static int generateFuel() {
        return (int) (Math.random() * 10);
    }

    private static String generateModel() {

        String[] models = {"bmw", "ford", "opel", "mazda"};
        return models[(int) (Math.random() * models.length)];
    }
}
