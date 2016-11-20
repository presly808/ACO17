package week2.cars;

/**
 * Created by Maria on 19.11.2016.
 */
public class TestCar {

    public static void main(String[] args) {
        Car car = new Car("Skoda", 100, 10000, "12345");

        boolean opened = car.open("12345");
        System.out.println("test car.open " + opened);

        String carInfoStr = car.fullInfo();
        System.out.println("test car.fullInfo() " + (carInfoStr.contains("Skoda") && carInfoStr.contains("100")));

        int currFuel = car.getFuel();
        int inFuel = 30;

        car.fillIn(inFuel);

        int expected = currFuel + inFuel;
        int actual = car.getFuel();

        System.out.println("test car.fillIn " + (expected == actual));
    }
}
