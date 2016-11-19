/**
 * Created by Влад on 19.11.2016.
 */
public class TestCarinit {
    public static void main(String[] args) {
        Car car = new Car();
        car.init("bmw", 10, 5000, true);
        System.out.print("method init() is " + (car.getModel().equals("bmw") && car.getFuel() == 10 && car.getPrice() == 5000
                && car.getOpened()));
    }
}
