package week1.Car;

public class Car {

    private int id ;

    private String model;

    private String originalKey;
    private boolean opened;

    private double fuel;
    private int consumption;

    private double price;


    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public Car(int id, String model, String originalKey, double fuel, int consumption, double price) {
        this.id = id;
        this.model = model;
        this.originalKey = originalKey;
        this.fuel = fuel;
        this.price = price;
        this.consumption = consumption;
    }

    public boolean open(String key) {
        if (originalKey.equals(key)) {
            return opened = true;
        }
        return opened;
    }

    public boolean close(String key) {
        if (originalKey.equals(key) && opened) {
            return opened = false;
        }
        return opened;
    }

    public String showInfo() {

        return String.format("id %d, model %s, fuel %.2f, consumption %d, price %.2f", id, model, fuel, consumption, price);
    }

    public double go(int km) {
        if (!opened || fuel == 0) {
            return 0;
        } else if (fuel < (km / (100 / consumption))) {
            return 0;
        }
        fuel = fuel - (km / (100 / consumption));

        return fuel;
    }
//
//    @Override
//    public String toString() {
//        return "Car{" +
//                "id=" + id +
//                ", model='" + model + '\'' +
//                ", originalKey='" + originalKey + '\'' +
//                ", opened=" + opened +
//                ", fuel=" + fuel +
//                ", consumption=" + consumption +
//                ", price=" + price +
//                '}';
//    }
}