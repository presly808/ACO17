package oop.week2;

/**
 * Created by Victoria on 11/19/2016.
 */


public class TestCar {
    public static void main(String[] args) {
        Car car0 = new Car("zebra");
        Car car1 = new Car("skoda");
        Car car2 = new Car("lada");
        Car car3 = new Car("daewoo");

        Car[] cars = {car0, car1, car2, car3};

        car0.setFuel(120);
        car0.setPrice(200000);
        car0.setOpened(true);
        car0.setKeyOpen(20);
        car0.setKeyClose(500);

        car1.setFuel(200);
        car1.setPrice(300000);
        car1.setOpened(false);
        car1.setKeyOpen(2222);
        car1.setKeyClose(1111);

        System.out.println(car1.close(1122));
        System.out.println(car1.isOpened());

        car2.setModel("smart");
        car2.setFuel(215);
        car2.setPrice(40000);
        car2.setOpened(false);
        car2.setKeyOpen(5555);
        car2.setKeyClose(4444);

        car3.setModel("lanos");
        car3.setFuel(19);
        car3.setPrice(12000);
        car3.setOpened(true);
        car3.setKeyOpen(3333);
        car3.setKeyClose(1000);

        for (int i = 0; i < cars.length; i++) {
            System.out.println("info about car #" + i + ": " + cars[i].getInfoString());
            System.out.println("whether car " + cars[i].getModel().toUpperCase() + " can go: " + cars[i].go());
            System.out.println();
        }

        System.out.println("the most expensive car is  " + getCarWithMaxPrice(cars).getInfoString());
    }

    public static Car getCarWithMaxPrice(Car[] cars) {
        int max = 0;
        int indexOfMax = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getPrice() > max) {
                max = cars[i].getPrice();
                indexOfMax = i;
            }
        }
        return cars[indexOfMax];
    }

}

