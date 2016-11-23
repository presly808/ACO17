package week1.utils;

import week1.Car.Car;

public class CarUtils {

    public static Car CarGenerate() {

        int id = generateId();

        String model = generateModel();
        String originalKey = generateOriginalKey();

        double fuel = generateFuel();
        int consumption = generateConsumption();
        double price = generatePrice();

        return new Car(id,model,originalKey,fuel,consumption,price);
    }

    private static int idValue = 1;
    private static int generateId() {
            return idValue++;
    }

    private static int generateNum(int a, int b) {
        return a + (int)( Math.random() * (b - a));
    }

    private static int generateConsumption() {
        return generateNum(3, 12);
    }

    private static double generatePrice() {
        return generateNum(3000, 12000);
    }

    private static double generateFuel() {
        return generateNum(20, 50);
    }

    private static String generateOriginalKey() {
        String[] str = {"M4eX","3dfZ","S5fL", "T3ewsT","tyg76","dM4eX","d3dfZ","Sdv5fL", "Tasd3ewsT","tasdyg76"};
        return str[(int)(Math.random()* str.length)];
    }

    private static String generateModel() {
       String[] str = {"MX","Z","SL", "TT", "CX","MX","Z","SL", "TT", "CX"};
       return str[(int)(Math.random()* str.length)];
    }
}
