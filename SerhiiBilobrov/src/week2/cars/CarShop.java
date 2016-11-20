package week2.cars;

/**
 * Created by Maria on 20.11.2016.
 */
public class CarShop {

    private String name;
    private String address;
    private Car[] cars;
    private int budget;

    public CarShop(String name, String address, Car[] cars, int budget) {
        this.name = name;
        this.address = address;
        this.cars = cars;
        this.budget = budget;
    }

    public String showAllCars(){
        String strCars = "";
        for (int i = 0; i < cars.length; i++) {
            Car carPlace = cars[i];
            if(carPlace != null){
                strCars += carPlace.fullInfo() + "\n";
            }
        }
        return strCars;
    }

    public boolean addCar(Car car){
        return false;
    }

    public Car buy(int carId, int money){
        // delete column value
        // cars[0] = null;
        return null;
    }
}
