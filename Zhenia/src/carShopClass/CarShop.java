package carShopClass;

import carClass.Car;

/**
 * Created by zhenia on 20.11.16.
 */
public class CarShop {
    private final int MAX_CAR_ARR_LEN = 20;
    private int count = 0;

    private Car[] carArr;

    private String name;
    private String adress;

    private int budget;

    public CarShop(Car[] carArr, String name, String adress, int budget) {
        if(carArr.length > MAX_CAR_ARR_LEN){
            System.out.println("Overflow error");
            count = 0;
            return;
        }

        this.carArr = new Car[carArr.length];

        for (int i = 0; i < carArr.length; i++) {
            this.carArr[i] = carArr[i];
        }

        this.name = name;

        this.adress = adress;

        this.budget = budget;

        this.count = carArr.length;
    }

    public String showAll() {
        String str = "";

        for (int i = 0; i < carArr.length; i++) {
            if(carArr[i] == null) {
                continue;
            }

            str += String.format("Car [%d]\n", i);
            str += carArr[i].showInfo();
            str += "\n";
        }

        return str;
    }

    public Car[] filter(int money) {
        Car[] tmpArr = new Car[carArr.length];
        int j = 0;

        for (int i = 0; i < carArr.length; i++) {
            if(carArr[i].getPrice() <= money) {
                tmpArr[j++] = carArr[i];
            }
        }

        Car[] res = new Car[j];

        for (int i = 0; i < res.length; i++) {
            res[i] = tmpArr[i];
        }

        return res;
    }

    public boolean addCar(Car car) {
        if(carArr.length + 1 > MAX_CAR_ARR_LEN) {
            return false;
        }

        Car[] newCarArr = new Car[carArr.length + 1];

        for (int i = 0; i < newCarArr.length - 1; i++) {
            newCarArr[i] = carArr[i];
        }

        newCarArr[newCarArr.length - 1] = car;

        carArr = newCarArr;

        count++;

        return true;
    }

    public Car buy(int money, int carId) {
        if(count < 1){
            System.out.println("Error");

            return null;
        }

        if(carArr[carId].getPrice() <= money) {
            budget += carArr[carId].getPrice();

            Car[] newCarArr = new Car[carArr.length - 1];

            for (int i = 0; i < carId; i++) {
                newCarArr[i] = carArr[i];
            }

            for (int i = carId + 1; i < carArr.length; i++) {
                newCarArr[i-1] = carArr[i];
            }

            Car tmp = carArr[carId];

            carArr = newCarArr;

            System.out.println("Successfully bought car " + tmp.getModel() + "\n");

            count--;

            return tmp;
        }

        System.out.println("error");

        return null;
    }

    public int getCount() {
        return count;
    }
}
