package Tests;

import carClass.Car;

/**
 * Created by zhenia on 19.11.16.
 */
public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("Volga", 100, 0.5, 10000, "carkey");

        System.out.println(car1.showInfo());

        boolean []res = new boolean[4];

        res[0] = car1.open("carkey");
        res[1] = car1.open("carkey");
        res[2] = car1.close("carkey");
        res[3] = car1.close("carkey");

        boolean []exp = {true, false, true, false};

        boolean testResult = true;

        for (int i = 0; i < res.length; i++) {
            testResult = testResult && (res[i] == exp[i]);
        }

        System.out.println("Is open/close test passed: " + testResult);
    }
}
