package avdieiev.week1.carShop;

import avdieiev.week1.Car;

public class CarShopTest {
    public static void main(String[] args) {
        Car[] arrCars = new Car[5];
        for (int i = 0; i < arrCars.length; i++) {
            arrCars[i] = CarUtils.generateCars();
        }

        CarShop Engine = new CarShop("Engine", "Brown Street 13", 100000, arrCars);
        String pricelist = Engine.showAllCars();
        System.out.println(pricelist);


    }
}
