package week2;

/**
 * Created by Maria on 19.11.2016.
 */
public class TestCar {

    public static void main(String[] args) {
        Car car = new Car();
        car.model = "Jiguli";
        car.fuel = 100;
        car.price = 3000;

        boolean opened = car.open("12345");

        System.out.println(opened);


    }
}
