package moto;

public class MotoShop {

    private Motorcycle suzuki = new Motorcycle("suzuki", 1000, "suzukiKey");
    private Motorcycle honda = new Motorcycle("honda", 1200, "hondaKey");
    private Motorcycle kawasaki = new Motorcycle("kawasaki", 1300, "kawasakiKey");
    private Motorcycle yamaha = new Motorcycle("yamaha", 2000, "yamahaKey");

    private Motorcycle[] motorcycles = {suzuki, honda, kawasaki, yamaha};

    public Motorcycle buyMoto(String model, int money) {
        Motorcycle res = null;

        for (int i = 0; i < this.motorcycles.length; i++) {
            if (model.equals(this.motorcycles[i].getModel()) && this.motorcycles[i].getPrice() <= money) {
                res = this.motorcycles[i];
            }
        }

        return res;
    }

    public boolean buyTools(int money) {

        return money >= 200;
    }

    public String showAll() {
        String res = "";

        for (int i = 0; i < this.motorcycles.length; i++) {
            res += new StringBuilder().append(this.motorcycles[i].showInfo() + "\n");
        }

        return res;
    }
}
