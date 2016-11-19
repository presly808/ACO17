public class Car {

    public String model;
    public double fuel;
    public int price;
    public boolean opened;

    private boolean key;

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public void getKet(int money) {

        this.key = money >= this.price;
    }

    public boolean openCar()  {

        return this.opened = this.key;
    }

    public double chargeCar(int money, int volume, String type) {

        double priceByLiter95 = 20;
        double priceByLiter96 = 25;
        double priceByLiter = 0;

        if (type.equals("95")) {
            priceByLiter = priceByLiter95;
        } else if (type.equals("96")) {
            priceByLiter = priceByLiter96;
        }

        return this.fuel = money / (priceByLiter * volume);
    }

    public boolean go() {

        return this.key && this.fuel > 0;
    }

    public String showInfo() {

        return String.format("Model - %s\nfuel - %.2f\nprice - %d\nis opened - %s",
                this.model, this.fuel, this.price, this.opened);
    }
}
