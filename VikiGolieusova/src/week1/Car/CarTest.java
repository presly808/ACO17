package week1.Car;


public class CarTest {
    public static void main(String[] args) {

        Car car = new Car(1,"audi", "yu", 40, 6, 15000.00);

        //tests for opening car
        System.out.println("method opened is " + !car.open("12"));

        System.out.println("method opened is " + car.open("yu"));


        //test for closed method(if car was opened + trueKey = false
        System.out.println("method close is " + car.close("yu"));


        //test for showInfo
        System.out.println("test for ShowInfo method " + car.showInfo().equals("model audi, fuel 40,00, consumption 6, price 15000,00"));


        // test for method go(km)
        car.open("yu");

        double exp = 40 - (130 / (100 / 6));
        double act = car.go(130);

        System.out.println("test for go() method is " + (act == exp) );

    }
}