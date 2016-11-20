package week2;

import week1.Car;

public class CarUtils {

    public static int generateKey() {
        return generateNum(0, 100);
    }

    public static int generateNum(int left, int right) {
        return left + (int) (Math.random() * (right - left));
    }

    public static double generatePrice() {
        return generateNum(1000, 5000);
    }

    public static int generateFuel() {
        return (int) (Math.random() * 10);
    }

    public static String generateModel() {

        String[] models = {"bmw", "ford", "opel", "mazda"};
        return models[(int) (Math.random() * models.length)];
    }

    public static int amountCar(CarShop carShop) {
        int amount = 0;
        for (int i = 0; i < carShop.getCars().length; i++) {
            if (carShop.getCars()[i] != null) {
                amount++;
            }
        }
        return amount;
    }
}
