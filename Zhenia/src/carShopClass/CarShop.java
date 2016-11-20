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
}
