/**
 * Created by Влад on 19.11.2016.
 */
public class TestCaropen {

    public static void main(String[] args) {

        Car car = new Car();
        car.init("bmw", 10, 5000, true);

        System.out.println("method open() is " + car.open(123));
    }
}
