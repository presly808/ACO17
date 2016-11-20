package oop.week2;

/**
 * Created by Victoria on 11/19/2016.
 */
public class TestCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.model = "Ford";
        car.fuel = 120;
        car.price = 200000;
        car.opened = true;
        car.keyOpen = 20;
        car.keyClose = 500;

        car.showInfo();

        Car car1 = new Car();
        car1.model = "skoda";
        car1.fuel = 200;
        car1.price = 300000;
        car1.opened = false;
        car1.keyOpen = 2222;
        car1.keyClose = 1111;

        car1.showInfo();

        System.out.println(car1.close(1122));
        System.out.println(car1.opened);

        Car car2 = new Car();
        car2.model = "smart";
        car2.fuel = 215;
        car2.price = 40000;
        car2.opened = true;
        car2.keyOpen = 2222;
        car2.keyClose = 1111;

        car2.showInfo();
        System.out.println("whether car " +  car2.model.toUpperCase()  + " can go:" +  car2.go());

        Car car3 = new Car();
        car3.model = "lanos";
        car3.fuel = 19;
        car3.price =  12000;
        car3.opened = true;
        car3.keyOpen = 2222;
        car3.keyClose = 1000;

        car3.showInfo();
        System.out.println("whether car " +  car3.model.toUpperCase()  + " can go:" + car3.go());


    }

}

