package carShopClass;

import carClass.Car;

/**
 * Created by zhenia on 20.11.16.
 */
public class CarShop {
    private Car[] carArr;

    private String name;
    private String adress;

    private int budget;

    public CarShop(Car[] carArr, String name, String adress, int budget) {
        this.carArr = new Car[carArr.length];

        for (int i = 0; i < carArr.length; i++) {
            this.carArr[i] = carArr[i];
        }

        this.name = name;

        this.adress = adress;

        this.budget = budget;
    }

    public String showAll() {
        String str = "";

        for (int i = 0; i < carArr.length; i++) {
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


}
