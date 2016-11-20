package week2;

public class TestCarShop {

    public static void main(String[] args) {

        CarShop carShop = new CarShop("Shop 1");
        for (int i = 0; i < carShop.getCars().length; i++) {
            carShop.getCars()[i] = CarUtils.generateCar();
        }
        System.out.println(carShop.showAll());
        System.out.println(carShop.filter(2000));


    }

}
