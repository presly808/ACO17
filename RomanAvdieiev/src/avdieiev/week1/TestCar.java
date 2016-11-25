package avdieiev.week1;

import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();

        Car car1 = new Car("BMW", 0, false, 30, 30000, "123", 10);

        String car1Info = car1.ShowAll();
        System.out.println(car1Info);

        Double car1Go = car1.go(km);
        System.out.println(car1Go);
    }
}
