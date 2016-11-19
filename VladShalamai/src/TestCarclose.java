/**
 * Created by Влад on 19.11.2016.
 */
public class TestCarclose {
    public static void main(String[] args) {

        Car car = new Car();
        car.init("bmw", 10, 5000, true);

        System.out.println("method close() is " + !car.close(123));
    }
}
