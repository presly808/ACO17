package moto.tests;

import moto.Motorcycle;

public class TestMotorcycle {
    public static void main(String[] args) {
        System.out.println("testOpen() && testClose() --> " + testOpen());
        System.out.println("testFillIn() --> " + testFillIn());
        System.out.println("testGo() --> " + testGo());
        System.out.println("testShowInfo() --> " + testShowInfo());

    }

    private static boolean testOpen() {
        Motorcycle motorcycle = new Motorcycle("yamaha", 1000, "yamahaKey");

        motorcycle.open("yamahaKey");
        boolean t1 = motorcycle.isOpen();

        motorcycle.close("yamahaKey");
        boolean t2 = motorcycle.isOpen();

        return t1 && !t2;
    }

    private static boolean testFillIn() {
        Motorcycle motorcycle = new Motorcycle("yamaha", 1000, "yamahaKey");
        motorcycle.fillIn(100);

        return motorcycle. getFuel() == 10;
    }

    private static boolean testGo() {
        Motorcycle motorcycle = new Motorcycle("yamaha", 1000, "yamahaKey");
        motorcycle.open("yamahaKey");
        motorcycle.fillIn(500);

        for (int i = 0; i < 10; i++) {
            motorcycle.go();
        }

        return motorcycle.getMileage() == 10 && motorcycle.getFuel() == 40;
    }

    private static boolean testShowInfo() {
        Motorcycle motorcycle = new Motorcycle("yamaha", 1000, "yamahaKey");
        String info = motorcycle.showInfo();

        return  info.contains(motorcycle.getModel()) &&
                info.contains(motorcycle.getKey()) &&
                info.contains(motorcycle.getPrice() + "");
    }
}
