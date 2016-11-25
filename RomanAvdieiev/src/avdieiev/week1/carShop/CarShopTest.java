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

        String listOfCars = Engine.filter(35000);
        System.out.println(listOfCars);

        Car desiredCar = Engine.buy(60000, 3);
        System.out.println(desiredCar.toString());

        String pricelist1 = Engine.showAllCars();
        System.out.println(pricelist1);

        System.out.println("Default budget + price for purchased car = " + Engine.getBudget());
    }
}
