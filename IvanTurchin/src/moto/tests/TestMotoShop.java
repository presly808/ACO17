package moto.tests;

import moto.MotoShop;
import moto.Motorcycle;

public class TestMotoShop {
    public static void main(String[] args) {

        System.out.println("testBuyMoto() --> " + testBuyMoto() +
                           "\ntestBuyTools() --> " + testBuyTools() +
                           "\ntestShowAll() --> " + testShowAll());
    }

    private static boolean testBuyMoto() {
        MotoShop motoShop = new MotoShop();
        Motorcycle motorcycle = motoShop.buyMoto("yamaha", 2000);

        return motorcycle.getModel().equals("yamaha") && motorcycle.getPrice() == 2000;
    }

    private static boolean testBuyTools() {

        return new MotoShop().buyTools(200);
    }

    private static boolean testShowAll() {
        MotoShop motoShop = new MotoShop();
        String all = motoShop.showAll();

        return all.contains("yamaha") && all.contains("kawasaki") &&
                all.contains("honda") && all.contains("suzuki");
    }
}