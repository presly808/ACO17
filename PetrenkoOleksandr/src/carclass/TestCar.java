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

        float fuel = 10;

        boolean canDrive = car1.canGo(fuel);

        System.out.println(canDrive);

        float timeIn = car1.timeDriving(10,50);
        System.out.println("This car can move " + timeIn + " hours");



    }


}
