package carclass;

/**
 * Created by Alexandr on 19.11.2016.
 */
public class TestCar {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1. model = "BMW";
        car1. fuel = 12;
        car1. prise = 15000;

        String info = car1.showInfo();
        System.out.println(info);

        int key = 123;

        boolean trueKey = car1.opened(key);

        System.out.println(trueKey);



    }


}
