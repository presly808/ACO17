package car;

import car.Car;

/**
 * Created by User on 19.11.2016.
 */

public class CarTest {

    public static void main(String[] args) {
        Car volga = new Car("Volga", 300, 6000, false, "open, please");


        System.out.println("test showInfo: " + (volga.showInfo().contains("Volga") && volga.showInfo().contains("6000")));


        System.out.println("test1 open: " + (volga.open("open, please") == true));

        System.out.println("test1 close: " + (volga.close("open, please") == false));

        System.out.println("test go: " + (volga.go(10) == volga.getFuel() - 10 / 2));

    }


}

