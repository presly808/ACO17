package moto.tests;

import moto.Biker;
import moto.Motorcycle;

public class TestBiker {
    public static void main(String[] args) {
        System.out.println("testBuyMotorcycle() --> " + testBuyMotorcycle() +
                           "\ntestBuyTools() --> " + testBuyTools() +
                           "\ntestSellMoto() --> " + testSellMoto() +
                           "\ntestFix() --> " + testFix() +
                           "\ntestShowInfo() --> " + testShowInfo());
    }

    private static boolean testBuyMotorcycle() {
        Biker biker = new Biker("Max", "380672849410", "Simferopolskaya 9a", 5000);
        biker.buyMotorcycle("yamaha");

        return biker.getMoney() == 3000 && biker.getMotorcycle().getModel().equals("yamaha");
    }

    private static boolean testBuyTools() {
        Biker biker = new Biker("Max", "380672849410", "Simferopolskaya 9a", 5000);
        biker.buyTools();

        return biker.isTools();
    }

    private static boolean testSellMoto() {
        Biker biker = new Biker("Max", "380672849410", "Simferopolskaya 9a", 5000);
        biker.buyMotorcycle("yamaha");
        biker.sellMoto();

        return biker.getMoney() == 4000 && biker.getMotorcycle() == null;
    }

    private static boolean testFix() {
        Biker biker = new Biker("Max", "380672849410", "Simferopolskaya 9a", 5000);
        biker.buyMotorcycle("yamaha");

        Motorcycle motorcycle = biker.getMotorcycle();

        motorcycle.open("yamahaKey");
        motorcycle.fillIn(500);

        for (int i = 0; i < 50; i++) {
            motorcycle.go();
        }

        biker.buyTools();
        biker.fix(motorcycle);

        return motorcycle.isServiceability();
    }

    private static boolean testShowInfo() {
        Biker biker = new Biker("Max", "380672849410", "Simferopolskaya 9a", 5000);

        String info = biker.showInfo();

        return info.contains(biker.getName()) && info.contains(biker.getAddress())
                && info.contains(biker.getPhone());
    }
}
