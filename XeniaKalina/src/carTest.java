/**
 * Created by User on 19.11.2016.
 */

public class carTest {

    public static void main(String[] args) {
        Car volga = new Car();
        volga.model = "Volga";
        volga.fuel = 300;
        volga.price = 6000;
        volga.open = false;
        volga.key = "open, please";

        System.out.println(volga.showInfo());

    }




}

